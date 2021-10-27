package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Lenovo Legion", 2.21, Category.DEVELOPERS),
            new LightNovel("Predator", 3.41, Category.GAMER),
            new LightNovel("Alienware", 4.51, Category.ARCHITECTURE),
            new LightNovel("Avell", 8.11, Category.DEVELOPERS),
            new LightNovel("MSI", 5.21, Category.DESIGNER),
            new LightNovel("Pavilion", 5.21, Category.DESIGNER)

    ));

    public static void main(String[] args) {
        Map<Promotion, List<LightNovel>> collect = lightNovels
                .stream()
                .collect(Collectors.groupingBy(StreamTest13::getPromotion));

        System.out.println(collect);

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.groupingBy(StreamTest13::getPromotion
                )));
        System.out.println(collect1);


    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
