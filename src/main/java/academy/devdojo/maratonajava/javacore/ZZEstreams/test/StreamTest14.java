package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest14 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Lenovo Legion", 2.21, Category.DEVELOPERS),
            new LightNovel("Predator", 3.41, Category.GAMER),
            new LightNovel("Alienware", 4.51, Category.ARCHITECTURE),
            new LightNovel("Avell", 8.11, Category.DEVELOPERS),
            new LightNovel("MSI", 5.21, Category.DESIGNER),
            new LightNovel("Pavilion", 5.21, Category.DESIGNER)

    ));

    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);
        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream()
                .collect(
                 Collectors.groupingBy(LightNovel::getCategory,
                 Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        Map<Category,LightNovel> collect2 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)),Optional::get)));
        System.out.println(collect2);

        Map<Category,LightNovel> collect3 = lightNovels.stream().collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect3);
    }
}
