package academy.devdojo.maratonajava.javacore.ZZGcconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGcconcorrencia.service.StoreService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest02 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPriceAsyncCompletableFuture(storeService);
    }

    private static void searchPriceAsyncCompletableFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2","Store 3","Store 4");

        List<CompletableFuture<Double>> completableFutures = stores.stream()
                .map(storeService::getPricesAsyncCompletableFuture)
                .collect(Collectors.toList());

        List<Double> prices = completableFutures.stream().map(CompletableFuture::join).collect(Collectors.toList());

        System.out.println(prices);
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesAsyncFuture %dms%n",(end-start));

    }
}
