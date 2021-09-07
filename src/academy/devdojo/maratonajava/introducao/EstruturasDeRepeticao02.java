package academy.devdojo.maratonajava.introducao;

public class EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000000; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
