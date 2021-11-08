package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {

    public static void main(String[] args) {

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)";
        String texto = "caiomouta@gmail.com, dumouta@hotmail.com, ccarrazedo@mail.br, yoga@lenovo.com, Ideapad@lenovo.com ";
        System.out.println("Email válido");
        System.out.println("#@!thinkpad@lenovo.com".matches(regex));
        System.out.println(texto.split(",")[1].trim());
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
