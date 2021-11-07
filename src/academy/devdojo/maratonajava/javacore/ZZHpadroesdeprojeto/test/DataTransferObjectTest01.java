package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.*;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Pessoa pessoa = Pessoa.PessoaBuilder
                .builder()
                .firstName("Caio")
                .lastName("Mouta")
                .build();
        ReportDto.ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName(pessoa)
                .build();
        System.out.println();

    }
}
