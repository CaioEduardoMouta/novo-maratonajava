package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

public class CurrencyFactory {
    public static Currency newCurrency(Country country){
        switch (country){
            case BRAZIL:
                return new Real  ();
            case USA:
                return new usDollar();
            default: throw new IllegalArgumentException("Não tem fundos");
        }
    }
}
