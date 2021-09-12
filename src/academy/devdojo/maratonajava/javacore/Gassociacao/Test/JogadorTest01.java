package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Zidane");
        Jogador jogador2 = new Jogador("Thierry Henry");
        Jogador jogador3 = new Jogador("Ronaldinho");
        Jogador[] jogadores = {jogador1,jogador2,jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
