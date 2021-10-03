package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {

    public static void main(String[] args) {
        // \d números
        // \D Letras e caracteres especiais
        // \s Espaços no texto
        // \w = todas letras , digitos e underscore
        // \W = Tudo o que é caractere especial
        // []
        //String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";
        //String texto = "abaaba";
        String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto: "+ texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("regex " +regex);
        System.out.println("Posicoes Encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }

        //Número hexadecimal em Java tem que começar com 0X
        int numeroHex = 0X1;
        System.out.println(numeroHex);
    }
}
