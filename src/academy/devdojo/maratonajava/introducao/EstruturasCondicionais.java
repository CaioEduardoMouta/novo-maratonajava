package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !

        if(isAutorizadoComprarBebida == false){
            System.out.println("Autorizado a comprar bebida");
        }else {
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }

        boolean c = false;
        if(c = true){
            System.out.println("Nuca deve ser feito");
        }

        System.out.println("Fora do If");
    }
}
