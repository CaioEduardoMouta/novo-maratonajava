package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Lenovo Legion",2.21),
            new LightNovel("Predator",3.41),
            new LightNovel("Alienware",4.51),
            new LightNovel("Avell",8.11),
            new LightNovel("MSI",5.21)
    ));
    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels){
            if(lightNovel.getPrice() <= 4){
                titles.add(lightNovel.getTitle());
            }
            if(titles.size() >=3) {
                break;
            }
        }
        System.out.println(lightNovels);
        System.out.println(titles);
    }
}
