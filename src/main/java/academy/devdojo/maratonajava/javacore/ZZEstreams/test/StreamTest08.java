package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class StreamTest08 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Lenovo Legion",2.21),
            new LightNovel("Predator",3.41),
            new LightNovel("Alienware",4.51),
            new LightNovel("Avell",8.11),
            new LightNovel("MSI",5.21)
    ));

    public static void main(String[] args) {
        lightNovels.stream()
                .map(LightNovel::getPrice )
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);


        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price >3)
                .sum();
    }
}
