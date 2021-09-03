package academy.devdojo.maratonajava.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // int , double ,float , char , byte , short, long, boolean
        int idade = 10;
        long numeroGrande = 100000;
        double salarioDouble = 4000;
        float salarioFloat = (float) 4800.00d;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Caio Mouta";

        System.out.println("A idade é " + idade +" anos");
        System.out.println(verdadeiro);
        System.out.println("char "+caractere);
        System.out.println(salarioFloat);
        System.out.println("Oi meu nome é" +nome);


    }
}
