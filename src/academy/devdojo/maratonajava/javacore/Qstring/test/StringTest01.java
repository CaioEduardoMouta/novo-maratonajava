package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {

    public static void main(String[] args) {
        String nome = "Caio";
        String nome2 = "Caio";
        nome = nome.concat(" Mouta");

        System.out.println(nome);
        //Comparação de referência
        System.out.println(nome == nome2);
        String nome3 = new String("Caio");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
