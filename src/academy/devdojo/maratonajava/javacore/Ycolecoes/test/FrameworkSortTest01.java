package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class JavaByIdComparator implements Comparator<Framework> {

    @Override
    public int compare(Framework java1, Framework java2) {
        return java1.getId().compareTo(java2.getId());
    }
}

public class FrameworkSortTest01 {

    public static void main(String[] args) {
        List<Framework> FrameworkJava = new ArrayList<>(6);
        FrameworkJava.add(new Framework(1L,"JPA",2.22));
        FrameworkJava.add(new Framework(2L,"Spring Boot",3.21));
        FrameworkJava.add(new Framework(3L,"JSF",12.2));
        FrameworkJava.add(new Framework(4L,"PLAY",8.12));
        FrameworkJava.add(new Framework(5L,"Hibernate",3.22));
        for (Framework framework : FrameworkJava) {
            System.out.println(framework);
        }
        Collections.sort(FrameworkJava);
        System.out.println("-----------");
        for (Framework framework : FrameworkJava) {
            System.out.println(framework);
        }

       //Collections.sort(FrameworkJava, new JavaByIdComparator());
        FrameworkJava.sort(new JavaByIdComparator());
        System.out.println("-----------");
        for (Framework framework : FrameworkJava) {
            System.out.println(framework);
        }
    }
}
