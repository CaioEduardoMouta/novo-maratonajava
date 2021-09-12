package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(190);

        Carro c1 = new Carro("Ferrari", 400);
        Carro c2 = new Carro("Mercedes",410);
        Carro c3 = new Carro("Red Bull",380);

        // Pode ser acessado diretamente com o nome da classe
        // Não precisa de uma variável de referência para ser acessado
        //Carro.velocidadeLimite = 190;

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
