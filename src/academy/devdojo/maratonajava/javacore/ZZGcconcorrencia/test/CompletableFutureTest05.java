package academy.devdojo.maratonajava.javacore.ZZGcconcorrencia.test;


import academy.devdojo.maratonajava.javacore.ZZGcconcorrencia.dominio.Quote;
import academy.devdojo.maratonajava.javacore.ZZGcconcorrencia.service.StoreServiceWithDiscount;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest05 {
    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesWithDiscountAsync(service);
    }

    private static void searchPricesWithDiscount(StoreServiceWithDiscount service){
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2","Store 3","Store 4");
        //stores.forEach(s -> System.out.println(service.getPriceSync(s)));

        stores.stream()
                .map(service::getPriceSync)
                .map(Quote::newQuote)
                .map(service::applyDiscount)
                .forEach(System.out::println);
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesAsyncFuture %dms%n",(end-start));
    }

    private static void searchPricesWithDiscountAsync (StoreServiceWithDiscount service){
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2","Store 3","Store 4");

        var completableFutures = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSync(s)))
                .map(cf -> cf.thenApply(Quote::newQuote))
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quote))))
                .map(cf -> cf.thenAccept(store -> System.out.printf("%s finished in %d%n", store, (System.currentTimeMillis() - start))))
                .toArray(CompletableFuture[]::new);

       // CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(completableFutures);
        CompletableFuture<Object> voidCompletableFuture = CompletableFuture.anyOf(completableFutures);
        voidCompletableFuture.join();
        System.out.printf("Finished? %b", voidCompletableFuture.isDone());

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesAsyncFuture %dms%n",(end-start));
    }

}
