package academy.devdojo.maratonajava.javacore.ZZGcconcorrencia.test;


import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;


public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Caio"));
        System.out.println(tq.offer("Mouta"));
        System.out.println(tq.offer("Mouta",10, TimeUnit.SECONDS));
        tq.put("DevDojo");
        if(tq.hasWaitingConsumer()){
            tq.transfer("Setup");
        }
        System.out.println(tq.tryTransfer("Oceania"));
        System.out.println(tq.tryTransfer("Europa", 5, TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.take());
        System.out.println(tq.remainingCapacity());
    }
}
