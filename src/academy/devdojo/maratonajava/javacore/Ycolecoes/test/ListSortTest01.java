package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> FramerworkJava = new ArrayList<>(6);
        FramerworkJava.add("Spring Boot");
        FramerworkJava.add("Hibernate");
        FramerworkJava.add("Play");
        FramerworkJava.add("JPA");
        FramerworkJava.add("JSF");
        Collections.sort(FramerworkJava);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(300.21);
        dinheiros.add(120.21);
        dinheiros.add(140.21);
        dinheiros.add(190.21);
        dinheiros.add(220.21);



        for (String framework: FramerworkJava) {
            System.out.println(framework);
        }
        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);
    }
}
