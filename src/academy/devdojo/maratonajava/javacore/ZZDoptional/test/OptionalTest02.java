package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.domain.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {

    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Tommy");
        mangaByTitle.ifPresent(m -> m.setTitle("Palmer"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);

        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Monster")
                .orElseGet(() -> new Manga(3,"Monster",20));
        System.out.println(newManga);
    }
}
