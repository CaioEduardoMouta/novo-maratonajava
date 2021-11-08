package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.anime.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {


        Supplier<AnimeComparators> newAnimeAcomparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeAcomparators.get();
        //AnimeComparators animeComparators = () -> new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Dragon Ball", 43),
                new Anime("Mortal Kombat", 90),
                new Anime("Street Fighter", 21)
        ));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = (title,episodes) -> new Anime(title,episodes);
        BiFunction<String, Integer, Anime> animeBiFunction1 = Anime::new;
    }
}
