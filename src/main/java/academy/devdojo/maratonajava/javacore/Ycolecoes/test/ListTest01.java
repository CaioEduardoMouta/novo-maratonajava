package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Caio");
        nomes.add("Khan Academy");
        nomes2.add("Marlene");
        nomes2.add("Code Academy");
       // System.out.println(nomes.remove("Caio"));

        nomes.addAll(nomes2);
        for(String nome:nomes){
            System.out.println(nome);
            // Não pode alterar o tamanho dinamicante quando está usando o for
        }


        System.out.println("----------");


        int size = nomes.size();
        for (int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));

        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
