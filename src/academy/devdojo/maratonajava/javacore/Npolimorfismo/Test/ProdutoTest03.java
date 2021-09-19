package academy.devdojo.maratonajava.javacore.Npolimorfismo.Test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static  void main (String[] args){
        Produto produto = new Computador("Lenovo Legion",9000);

        Tomate tomate = new Tomate("Tomato",20);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------");
        CalculadoraImposto.calcularImposto(produto);

    }
}
