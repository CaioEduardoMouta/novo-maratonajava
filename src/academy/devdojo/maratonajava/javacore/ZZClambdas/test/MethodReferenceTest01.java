package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.anime.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Dragon Ball",43),
                new Anime("Mortal Kombat",90),
                new Anime("Street Fighter",21)
        ));
       // Collections.sort(animeList,(a1,a2) -> a1.getTitle().compareTo((a2.getTitle())));
        //Collections.sort(animeList,AnimeComparators::compareByTitle);
        Collections.sort(animeList, AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
