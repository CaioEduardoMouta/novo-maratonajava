package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest15 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Lenovo Legion", 2.21, Category.DEVELOPERS),
            new LightNovel("Predator", 3.41, Category.GAMER),
            new LightNovel("Alienware", 4.51, Category.ARCHITECTURE),
            new LightNovel("Avell", 8.11, Category.DEVELOPERS),
            new LightNovel("MSI", 5.21, Category.DESIGNER),
            new LightNovel("Pavilion", 5.21, Category.DESIGNER)

    ));

    public static void main(String[] args) {

        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);


        Map<Category, Set<Promotion>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion, Collectors.toSet())));

        System.out.println(collect1);

        Map<Category, LinkedHashSet<Promotion>> collect2 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion,
                        Collectors.toCollection(LinkedHashSet::new))));

        System.out.println(collect2);
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}

