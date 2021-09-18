package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClientTest01 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA,Cliente.TipoPagamento.CREDITO);
        Cliente cliente1 = new Cliente("Tsubasa",TipoCliente.PESSOA_JURIDICA,Cliente.TipoPagamento.DEBITO);

        System.out.println(cliente);
        System.out.println(cliente1);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente1 = TipoCliente.valueOf("Pessoa Física");
        System.out.println(tipoCliente1);
    }
}
