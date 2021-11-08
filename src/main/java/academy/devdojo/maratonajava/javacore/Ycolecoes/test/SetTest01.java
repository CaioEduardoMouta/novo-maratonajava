package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Framework;

import java.util.*;

public class SetTest01 {

    public static void main(String[] args) {
        Set<Framework> frameworkPHP = new LinkedHashSet<>();
        frameworkPHP.add(new Framework(1L,"Laravel",2.22));
        frameworkPHP.add(new Framework(2L,"Cake",3.21));
        frameworkPHP.add(new Framework(3L,"Symfony",12.2));
        frameworkPHP.add(new Framework(4L,"Zend",8.12));
        frameworkPHP.add(new Framework(5L,"CodeInteger",3.22));

        for(Framework framework : frameworkPHP){
            System.out.println(framework);
        }
    }
}
