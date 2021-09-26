package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {

    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();
        for(String isoLanguge : isoLanguages) {
            System.out.println(isoLanguge + " ");
        }
        System.out.println();
        for (String isoCountry: isCountries) {
            System.out.println(isoCountry+ " ");

        }

    }
}
