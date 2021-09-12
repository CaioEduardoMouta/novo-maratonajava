package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Diego Fernandes Rocketseat");
        funcionario.setIdade(25);
        funcionario.setSalarios(new double[]{2221,5432,3555,9221});
        funcionario.imprime();
        System.out.println("Media "+funcionario.getMedia());
        funcionario.imprimeMediaSalario();
    }
}
