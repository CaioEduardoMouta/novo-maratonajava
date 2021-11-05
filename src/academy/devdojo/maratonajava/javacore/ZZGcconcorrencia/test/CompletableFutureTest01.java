package academy.devdojo.maratonajava.javacore.ZZGcconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGcconcorrencia.service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureTest01 {

    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        //searchPriceAsyncFuture(storeService);
        searchPriceAsyncCompletableFuture(storeService);
    }

    private static void searchPriceSync(StoreService storeService){
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("Store 1"));
        System.out.println(storeService.getPriceSync("Store 2"));
        System.out.println(storeService.getPriceSync("Store 3"));
        System.out.println(storeService.getPriceSync("Store 4"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n",(end-start));

    }

    private static void searchPriceAsyncFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        Future<Double> priceAsyncFuture1 = storeService.getPricesAsyncFuture("Store 1");
        Future<Double> priceAsyncFuture2 = storeService.getPricesAsyncFuture("Store 2");
        Future<Double> priceAsyncFuture3 = storeService.getPricesAsyncFuture("Store 3");
        Future<Double> priceAsyncFuture4 = storeService.getPricesAsyncFuture("Store 4");

        try {
            System.out.println(priceAsyncFuture1.get());
            System.out.println(priceAsyncFuture2.get());
            System.out.println(priceAsyncFuture3.get());
            System.out.println(priceAsyncFuture4.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesAsyncFuture %dms%n",(end-start));
        StoreService.shoutdown();
    }

    private static void searchPriceAsyncCompletableFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        CompletableFuture<Double> priceAsyncFuture1 = storeService.getPricesAsyncCompletableFuture("Store 1");
        CompletableFuture<Double> priceAsyncFuture2 = storeService.getPricesAsyncCompletableFuture("Store 2");
        CompletableFuture<Double> priceAsyncFuture3 = storeService.getPricesAsyncCompletableFuture("Store 3");
        CompletableFuture<Double> priceAsyncFuture4 = storeService.getPricesAsyncCompletableFuture("Store 4");
            System.out.println(priceAsyncFuture1.join());
            System.out.println(priceAsyncFuture2.join());
            System.out.println(priceAsyncFuture3.join());
            System.out.println(priceAsyncFuture4.join());
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesAsyncFuture %dms%n",(end-start));
        StoreService.shoutdown();
    }
}
