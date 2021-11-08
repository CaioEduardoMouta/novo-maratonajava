package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Framework;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Framework> frameworkQueue = new PriorityQueue<>(new FrameworkDificultComparator().reversed());
        frameworkQueue.add(new Framework(1L,"JPA",2.22,3));
        frameworkQueue.add(new Framework(2L,"Spring Boot",3.21,4));
        frameworkQueue.add(new Framework(3L,"JSF",12.2,5));
        frameworkQueue.add(new Framework(4L,"PLAY",8.12,6));
        frameworkQueue.add(new Framework(5L,"Hibernate",3.22,1));

        while(!frameworkQueue.isEmpty()){
            System.out.println(frameworkQueue.poll());
        }



    }
}
