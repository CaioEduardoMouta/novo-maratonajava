package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {

    public static void main(String[] args) {
        // \d números
        // \D Letras e caracteres especiais
        // \s Espaços no texto
        // \w = todas letras , digitos e underscore
        // \W = Tudo o que é caractere especial
        String regex = "\\W";
        //String texto = "abaaba";
        String texto2 = "@!fda3fs2a18 9fsaa67as6a";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto: "+ texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("regex " +regex);
        System.out.println("Posicoes Encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
