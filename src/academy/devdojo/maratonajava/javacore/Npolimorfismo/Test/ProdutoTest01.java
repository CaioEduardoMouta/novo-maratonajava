package academy.devdojo.maratonajava.javacore.Npolimorfismo.Test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {

    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate do DevDojo",10);
        Televisao televisao = new Televisao("AOC Monitor ", 2000);

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------");
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImposto(televisao);



    }
}
