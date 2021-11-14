package academy.devdojo.maratonajava.javacore.ZZJcrud.test;

import academy.devdojo.maratonajava.javacore.ZZJcrud.service.AnimeService;
import academy.devdojo.maratonajava.javacore.ZZJcrud.service.ProducerService;

import java.util.Scanner;

public class CrudTest01 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        while(true){
            menu();
            op = Integer.parseInt(SCANNER.nextLine());
            if(op == 0) break;
            switch (op) {
               case 1 -> {
                  producerMenu();
                  op = Integer.parseInt(SCANNER.nextLine());
                  ProducerService.menu(op);
               }
               case 2 ->{
                   animeMenu();
                   op = Integer.parseInt(SCANNER.nextLine());
                   AnimeService.menu(op);

               }
            }

        }
    }

    private static void menu(){
        System.out.println("Tipo do nº para a operação");
        System.out.println("1. Produtor");
        System.out.println("2. Anime");
        System.out.println("0.  Saida");
    }

    private static void producerMenu(){
        System.out.println("Tipo do nº para a operação");
        System.out.println("1. Procure pelo produtor");
        System.out.println("2. Delete producer");
        System.out.println("3. Inserindo o produto");
        System.out.println("4. Atualizando dados");
        System.out.println("9. Voltar");


    }

    private static void animeMenu(){
        System.out.println("Tipo do nº para a operação");
        System.out.println("1. Procure pelo Anime");
        System.out.println("2. Delete Anime");
        System.out.println("3. Inserindo o Anime");
        System.out.println("4. Atualizando Anime");
        System.out.println("9. Voltar");


    }

}
