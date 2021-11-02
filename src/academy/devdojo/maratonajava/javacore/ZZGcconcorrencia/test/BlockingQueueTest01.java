package academy.devdojo.maratonajava.javacore.ZZGcconcorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        bq.put("Caio");
        System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), bq.peek());
        System.out.println("tentando adicionar outro valor");
        new Thread(new RemoveFromQueue());
        bq.put("Mouta");
        System.out.printf("%s adicionar o valor %s%n", Thread.currentThread().getName(), bq.peek());
    }

    static class RemoveFromQueue implements Runnable {
        private final BlockingQueue<String> bq;

        public RemoveFromQueue(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
            System.out.printf("%s adicionar o valor %s%n", Thread.currentThread().getName(), bq.peek());
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("%s removing value from queue %s%n ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
