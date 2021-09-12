package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

import java.sql.SQLOutput;

public class Anime {
    private String nome;
    private int[] episodios;
    {
        //Executado primeiro antes do construtor
        System.out.println("Dentro do bloco de Inicialização  ");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio:this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
