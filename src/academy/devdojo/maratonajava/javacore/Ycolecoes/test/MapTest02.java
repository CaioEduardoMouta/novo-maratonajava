package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Framework;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {

    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Caio Mouta");
        Consumidor consumidor2 = new Consumidor("Carrazedo");

        Framework framework1 = new Framework(1L,"JPA",2.22);
        Framework framework2 = new Framework(2L,"Spring Boot",3.21);
        Framework framework3 = new Framework(3L,"JSF",12.2);
        Framework framework4 = new Framework(4L,"PLAY",8.12);
        Framework framework5 = new Framework(5L,"Hibernate",3.22);

        Map<Consumidor,Framework> consumidorFramework = new HashMap<>();
        consumidorFramework.put(consumidor1,framework3);
        consumidorFramework.put(consumidor2,framework2);
        for(Map.Entry<Consumidor,Framework> entry : consumidorFramework.entrySet()){
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }

        System.out.println(consumidor1);
    }
}
