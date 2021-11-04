package academy.devdojo.maratonajava.javacore.ZZGcconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGcconcorrencia.service.StoreService;

public class CompletableFutureTest01 {

    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPriceSync(storeService);
    }

    private static void searchPriceSync(StoreService storeService){
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("Store 1"));
        System.out.println(storeService.getPriceSync("Store 2"));
        System.out.println(storeService.getPriceSync("Store 3"));
        System.out.println(storeService.getPriceSync("Store 4"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %d%n",(end-start));
    }

    private static void searchPriceAsyncFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        storeService.getPricesAsyncFuture("Store 1"));
        storeService.getPricesAsyncFuture("Store 2"));
        storeService.getPricesAsyncFuture("Store 3"));
        storeService.getPricesAsyncFuture("Store 4"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %d%n",(end-start));
    }
}
