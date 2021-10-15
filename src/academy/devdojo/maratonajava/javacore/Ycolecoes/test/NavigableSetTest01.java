package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Framework;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmarthphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class FrameworkDificultComparator implements Comparator<Framework>{

    @Override
    public int compare(Framework o1, Framework o2) {
        return Double.compare(o1.getDificuldade(),o2.getDificuldade());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmarthphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("221","Xiaomi");
        set.add(smartphone);
        NavigableSet<Framework> FrameworkJava = new TreeSet<>(new FrameworkDificultComparator());
        FrameworkJava.add(new Framework(1L,"JPA",2.22,3));
        FrameworkJava.add(new Framework(2L,"Spring Boot",3.21,4));
        FrameworkJava.add(new Framework(3L,"JSF",12.2,5));
        FrameworkJava.add(new Framework(4L,"PLAY",8.12,6));
        FrameworkJava.add(new Framework(5L,"Hibernate",3.22,1));

        for (Framework framework: FrameworkJava.descendingSet()) {
            System.out.println(framework);
        }

        Framework Grails = new Framework(1L,"Grails",8.23,3);

        System.out.println("---------");
        System.out.println(FrameworkJava.lower(Grails));
        System.out.println(FrameworkJava.floor(Grails));
        System.out.println(FrameworkJava.higher(Grails));
        System.out.println(FrameworkJava.ceiling(Grails));

        System.out.println(FrameworkJava.size());
        System.out.println(FrameworkJava.pollFirst());
        System.out.println(FrameworkJava.pollLast());
    }
}
