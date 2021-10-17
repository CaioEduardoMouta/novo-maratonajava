package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(
                new Carro("BMW"),
                new Carro("Lamborghini"))
        );

        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(
                new Barco("Lancha"),
                new Barco("Canoa"))
        );
        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalServiceCarro.buscarObjetoDisponível();
        System.out.println("Usando o Barco por um mês...");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("___________________");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponível();
        System.out.println("Usando o Barco por um mês...");
        rentalServiceBarco.retornarObjetoAlugado(barco);
    }
}
