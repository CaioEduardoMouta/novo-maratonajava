package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(10 - 5);
    }

    public void multiplicaDoisNumeros(int num, float num2) {
        System.out.println(num * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1/num2;
    }
}
