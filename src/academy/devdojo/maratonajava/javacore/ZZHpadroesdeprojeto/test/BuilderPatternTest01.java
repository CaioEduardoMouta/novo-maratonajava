package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Pessoa;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
            Pessoa build = new Pessoa.PessoaBuilder()
                        .firstName("Caio")
                        .lastName("Mouta")
                        .username("Caio.dev")
                        .email("caio.mouta.dev@gmail.com")
                        .build();
        System.out.println(build);
    }
}
