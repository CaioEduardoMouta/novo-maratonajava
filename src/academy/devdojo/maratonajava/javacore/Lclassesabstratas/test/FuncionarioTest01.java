package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
       // Funcionario funcionario = new Funcionario("Zoro",2000);
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Caio Carrazedo", 12000);
       // System.out.println(funcionario);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }

}
