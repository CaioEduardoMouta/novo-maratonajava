package academy.devdojo.maratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println( numero02+ numero01 +"Valor "+ numero02+ numero01);
        System.out.println(resultado);

        int resto = 21 % 2;
        System.out.println(resto);

        boolean dezMaiorQueVinte = 10 > 20;
        boolean dezMenorQueVinte = 10 < 20;
        boolean dezIgualAVinte = 10 == 20;
        boolean dezIgualDez = 10 == 10;
        boolean dezDiferenteDez = 10 != 10;
        System.out.println("Dez maior que vinte" + dezMaiorQueVinte);
        System.out.println("Dez menor que Vinte" + dezMenorQueVinte);
        System.out.println("Dez igual a Vinte" + dezIgualAVinte);
        System.out.println("Dez igual a Dez" + dezIgualDez);
        System.out.println("Dez diferente de dez" + dezDiferenteDez);

        // &&(AND) , ||(OR) , ! (NOT)
        int idade = 28;
        float salario = 4000F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("Playstation 5 é compravel" +isPlaystationCincoCompravel);

        // = +=-= *= /= %=
        double bonus = 2000;// 2000
        bonus += 1000;//3000
        bonus -= 1000;//2000
        bonus *= 2; //4000
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);
    }
}
