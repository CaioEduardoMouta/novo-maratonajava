package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImprimirEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImprimirEstudante imprimir = new ImprimirEstudante();

        estudante01.nome = "ProgramdorBR";
        estudante01.idade = 22;
        estudante01.sexo = 'M';

        estudante02.nome = "Loiane Groner";
        estudante02.idade = 43;
        estudante02.sexo = 'F';

        imprimir.imprime(estudante01);
        imprimir.imprime(estudante02);

        System.out.println("############");

        imprimir.imprime(estudante01);
        imprimir.imprime(estudante02);

        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);

        System.out.println("----------------");

        System.out.println(estudante02.nome);
        System.out.println(estudante02.sexo);
        System.out.println(estudante02.idade);

    }
}
