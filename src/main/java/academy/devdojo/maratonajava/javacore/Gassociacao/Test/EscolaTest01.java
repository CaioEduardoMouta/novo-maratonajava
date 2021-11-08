package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Diego Fernandes");
        Professor professor2 = new Professor("Mayk Brito");
        Professor[] professores = {professor,professor2};
        Escola escola = new Escola("Ignite",professores);

        escola.imprime();
    }
}
