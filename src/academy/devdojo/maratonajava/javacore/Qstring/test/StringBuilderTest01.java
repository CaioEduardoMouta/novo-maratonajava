package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Caio Mouta";
        nome.concat(" DevDojo");
        nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Caio Mouta");
        sb.append(" Developer").append(" Programmer");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
