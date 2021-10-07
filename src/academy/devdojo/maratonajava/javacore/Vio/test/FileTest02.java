package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {

    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("arquivo");
        boolean isDireotrioCriado = fileDiretorio.mkdir();
        System.out.println("Pasta criada? " + isDireotrioCriado);
        File fileArquivoDiretorio = new File(fileDiretorio,"arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("arquivo.txt criado?"+isFileCreated);

        File fileRenamed = new File(fileDiretorio,"arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("Renomeado" +isRenamed);

        File diretorioRenamed = new File("Pasta2");
        boolean isDiretorioRenomeado = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Pasta renomeada?"+isDiretorioRenomeado);


    }
}

