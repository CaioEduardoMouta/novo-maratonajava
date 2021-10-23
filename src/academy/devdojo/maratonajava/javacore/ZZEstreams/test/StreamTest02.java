package academy.devdojo.maratonajava.javacore.ZZEstreams.test;


import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Lenovo Legion",2.21),
            new LightNovel("Predator",3.41),
            new LightNovel("Alienware",4.51),
            new LightNovel("Avell",8.11),
            new LightNovel("MSI",5.21)
    ));
    public static void main(String[] args) {
        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(titles);
    }
}
