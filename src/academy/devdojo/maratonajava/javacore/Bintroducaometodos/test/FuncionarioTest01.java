package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Diego Fernandes Rocketseat";
        funcionario.idade = 26;
        funcionario.salarios = new double[]{2221,5432,3555,9221};

        funcionario.imprime();
        funcionario.imprimeMediaSalario();
    }
}
