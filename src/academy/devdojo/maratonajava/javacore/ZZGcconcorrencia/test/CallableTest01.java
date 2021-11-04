package academy.devdojo.maratonajava.javacore.ZZGcconcorrencia.test;

import java.util.concurrent.*;

class RandomNumberCallable implements Callable<String>{

    @Override
    public String call() throws Exception {
        int count = ThreadLocalRandom.current().nextInt(1,11);
        for (int i = 0; i < count; i++) {
            System.out.printf("%s executando uma tarefa callable...%n",Thread.currentThread().getName());
        }
        return String.format("$s finalizando o número aleatorio",Thread.currentThread(),count);
    }
}

public class CallableTest01 {
    public static void main(String[] args) {
      RandomNumberCallable randomNumberCallable = new RandomNumberCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future = executorService.submit(randomNumberCallable);
        try {
            String s = future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("Programa Finalizado");
        executorService.shutdown();
    }
}
