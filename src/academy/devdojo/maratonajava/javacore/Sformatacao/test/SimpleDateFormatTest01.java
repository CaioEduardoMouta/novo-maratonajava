package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {

    public static void main(String[] args) {
        String mascara = "yyyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat();
        System.out.println(sdf.format(new Date()));
//        try {
//            System.out.println(sdf.parse("yyyy.MM.dd G 'at' HH:mm:ss z"));
//        }catch (ParseException e){
//            e.printStackTrace();
//        }

    }
}
