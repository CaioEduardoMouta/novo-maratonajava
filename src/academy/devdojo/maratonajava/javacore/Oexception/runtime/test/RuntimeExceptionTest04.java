package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {

    public static void main(String[] args) {

        //Excessões mais genéricas sempre tem que vim no final
        try{
            throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch(RuntimeException e){
            System.out.println("IndexOutOfBoundsException");
        }


        try{
            talvezLanceException();
        }catch (IOException | SQLException e){
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }


}
