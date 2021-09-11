package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Felipe Dechamps");
        pessoa.setIdade(22);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
