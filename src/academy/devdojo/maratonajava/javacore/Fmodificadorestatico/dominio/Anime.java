package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    //Quando colocar static vai ser o primeiro a ser executado
    static {
        //Executado primeiro antes do construtor
        System.out.println("Dentro do bloco de Inicialização  ");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Bloco de Inicialização 2");
    }

    static {
        System.out.println("Bloco de Inicialização 3");
    }

    {
        System.out.println("Não estático");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio:Anime.episodios) {
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
