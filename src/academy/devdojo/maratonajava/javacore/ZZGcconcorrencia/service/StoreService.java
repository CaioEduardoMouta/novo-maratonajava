package academy.devdojo.maratonajava.javacore.ZZGcconcorrencia.service;

import java.util.concurrent.*;

public class StoreService {
    private static final ExecutorService ex = Executors.newCachedThreadPool();

    public double getPriceSync(String storeName){
        System.out.printf("Getting prices sync for store %s%n",storeName);
        return priceGenerator();
    }

    public Future<Double> getPricesAsyncFuture(String storeName){
        System.out.printf("Getting prices sync for store %s%n",storeName);
        Future<Double> submit = ex.submit(this::priceGenerator);
        ex.shutdown();
        return submit;
    }


    private double priceGenerator(){
        System.out.printf("%s generalizando preço %n", Thread.currentThread());
        delay();
        return ThreadLocalRandom.current().nextInt(1,500) * 10;
    }

    private void delay(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
