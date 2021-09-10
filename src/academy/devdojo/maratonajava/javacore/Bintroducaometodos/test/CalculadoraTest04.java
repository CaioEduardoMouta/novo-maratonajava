package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alterarDoisNumeros(a,b);
        System.out.println("Dentro Calculadora Teste 04");
        System.out.println("num 1" +a);
        System.out.println("Num 2" +b);

    }
}
