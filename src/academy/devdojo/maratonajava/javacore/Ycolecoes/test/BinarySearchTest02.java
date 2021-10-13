package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Framework;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {

    public static void main(String[] args) {
        JavaByIdComparator javaByIdComparator = new JavaByIdComparator();
        List<Framework> FrameworkJava = new ArrayList<>(6);
        FrameworkJava.add(new Framework(1L,"JPA",2.22));
        FrameworkJava.add(new Framework(2L,"Spring Boot",3.21));
        FrameworkJava.add(new Framework(3L,"JSF",12.2));
        FrameworkJava.add(new Framework(4L,"PLAY",8.12));
        FrameworkJava.add(new Framework(5L,"Hibernate",3.22));

       // Collections.sort(FrameworkJava);

        FrameworkJava.sort(new JavaByIdComparator());
        for (Framework framework : FrameworkJava) {
            System.out.println(framework);
        }

        Framework frameToSearch = new Framework(5L,"Hibernate",3.22);

        System.out.println(Collections.binarySearch(FrameworkJava, frameToSearch,javaByIdComparator));


    }
}
