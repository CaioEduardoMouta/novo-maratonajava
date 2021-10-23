package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Lenovo Legion",2.21),
            new LightNovel("Predator",3.41),
            new LightNovel("Alienware",4.51),
            new LightNovel("Avell",8.11),
            new LightNovel("MSI",5.21)
    ));

    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.stream().forEach(System.out::println);
        long count = stream.filter(ln -> ln.getPrice() <= 4).count();
        long count2 = lightNovels.stream()
                .distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count();
        System.out.println(count);
        System.out.println(count2);
    }
}
