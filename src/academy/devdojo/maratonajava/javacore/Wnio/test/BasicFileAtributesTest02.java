package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAtributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta2/new.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastAccessTime();
        FileTime lastAcessTime = basicFileAttributes.lastModifiedTime();

        System.out.println("Creation Time"+creationTime);
        System.out.println("LastModifiedTime"+lastModifiedTime);
        System.out.println("lastAcessTime"+ lastAcessTime);

       BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributes.class);
       FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
       fileAttributeView.setTimes(lastModifiedTime, newCreationTime, creationTime );
       
    }
}
