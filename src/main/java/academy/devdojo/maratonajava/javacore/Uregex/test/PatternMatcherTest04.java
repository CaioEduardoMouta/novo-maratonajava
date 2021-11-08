package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {

    public static void main(String[] args) {

        //? Zero ou uma
        // * Zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // () agrupamento funciona junto com o ()
        // | procura letras especificas no texto
        // $ representa o fim da linha
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto: "+ texto);
        System.out.println("Indice: 0123456789");
        System.out.println("regex " +regex);
        System.out.println("Posicoes Encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }

        //Número hexadecimal em Java tem que começar com 0X

    }
}
