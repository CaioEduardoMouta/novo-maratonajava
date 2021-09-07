package academy.devdojo.maratonajava.introducao;

public class Arrays02 {
    public static void main(String[] args) {
        /*
        String guarda null
        Char guarda , mas não aparece nada
        Boolean é false
        Float guarda 0.0
        int = 0
         */
        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Gohan";
        nomes[2] = "Vegeta";
        nomes[3] = "Kuririn";
        // Lenght = tamanho
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
