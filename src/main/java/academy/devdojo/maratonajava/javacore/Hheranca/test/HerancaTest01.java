package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.Dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.Dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.Dominio.Pessoa;

public class HerancaTest01 {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua ");
        endereco.setCep("08030-590");
        Pessoa pessoa = new Pessoa("Caio");
        pessoa.setCpf("11234-221");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Eduardo");
        funcionario.setCpf("11111");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(22222);
        System.out.println("-------------");
        funcionario.imprime();
    }
}
