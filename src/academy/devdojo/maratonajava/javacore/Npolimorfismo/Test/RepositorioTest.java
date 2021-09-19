package academy.devdojo.maratonajava.javacore.Npolimorfismo.Test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest {

    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        Repositorio repositorio2 = new RepositorioArquivo();
        Repositorio repositorio3 = new RepositorioMemoria();
        repositorio.salvar();
        repositorio2.salvar();
        repositorio3.salvar();
        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Picolo");
        System.out.println(list);
    }
}
