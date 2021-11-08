package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Framework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {

    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Caio Mouta");
        Consumidor consumidor2 = new Consumidor("Carrazedo");

        Framework framework1 = new Framework(1L,"JPA",2.22);
        Framework framework2 = new Framework(2L,"Spring Boot",3.21);
        Framework framework3 = new Framework(3L,"JSF",12.2);
        Framework framework4 = new Framework(4L,"PLAY",8.12);
        Framework framework5 = new Framework(5L,"Hibernate",3.22);

        List<Framework> frameworkConsumidorList = List.of(framework1,framework2,framework5);
        List<Framework> frameworkConsumidorList2 = List.of(framework3,framework4,framework5);
        Map<Consumidor, List<Framework>> consumidorFramework = new HashMap<>();
        consumidorFramework.put(consumidor1,frameworkConsumidorList);
        consumidorFramework.put(consumidor2,frameworkConsumidorList2);

        for (Map.Entry<Consumidor, List<Framework>> entry : consumidorFramework.entrySet()){
            System.out.println("-----"+entry.getKey().getNome());
            for(Framework framework : entry.getValue()) {
                System.out.println("--------"+framework.getNome());
            }
        }



    }
}
