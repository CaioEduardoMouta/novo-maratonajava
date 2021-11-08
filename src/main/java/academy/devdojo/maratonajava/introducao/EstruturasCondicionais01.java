package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 45;
        String categoria;

        if(idade < 15) {
            categoria = "Categoria Infantil";
        }else if(idade >= 15 && idade < 18){
            categoria = "Categoria Juvenil";
        }else {
            categoria = "Categoria Adulto";
        }
        categoria = idade < 15 ? "Categoria Infantil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulto";
        System.out.println(categoria);
    }
}
