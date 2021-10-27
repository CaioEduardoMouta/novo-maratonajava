package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest12 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Lenovo Legion", 2.21, Category.DEVELOPERS),
            new LightNovel("Predator", 3.41, Category.GAMER),
            new LightNovel("Alienware", 4.51, Category.ARCHITECTURE),
            new LightNovel("Avell", 8.11, Category.DEVELOPERS),
            new LightNovel("MSI", 5.21, Category.DESIGNER)

    ));

    public static void main(String[] args) {
        Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();
        List<LightNovel> gamer = new ArrayList<>();
        List<LightNovel> developers = new ArrayList<>();
        List<LightNovel> architecture = new ArrayList<>();
        for(LightNovel lightNovel : lightNovels){
            switch (lightNovel.getCategory()){
                case GAMER: gamer.add(lightNovel); break;
                case ARCHITECTURE: architecture.add(lightNovel); break;
                case DEVELOPERS: developers.add(lightNovel); break;
             }
        }
        categoryLightNovelMap.put(Category.GAMER, gamer);
        categoryLightNovelMap.put(Category.ARCHITECTURE, architecture);
        categoryLightNovelMap.put(Category.DEVELOPERS, developers);
        System.out.println(categoryLightNovelMap);

        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}
