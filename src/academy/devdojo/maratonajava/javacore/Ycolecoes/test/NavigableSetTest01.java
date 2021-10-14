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

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmarthphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("221","Xiaomi");
        set.add(smartphone);
        NavigableSet<Framework> FrameworkJava = new TreeSet<>();
        FrameworkJava.add(new Framework(1L,"JPA",2.22));
        FrameworkJava.add(new Framework(2L,"Spring Boot",3.21));
        FrameworkJava.add(new Framework(3L,"JSF",12.2));
        FrameworkJava.add(new Framework(4L,"PLAY",8.12));
        FrameworkJava.add(new Framework(5L,"Hibernate",3.22));
        for (Framework framework: FrameworkJava) {
            System.out.println(framework);
        }
    }
}
