package academy.devdojo.maratonajava.javacore.ZZGcconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Members;
import academy.devdojo.maratonajava.javacore.ZZFthreads.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread caio = new Thread(new EmailDeliveryService(members), "Caio ");
        Thread mouta = new Thread(new EmailDeliveryService(members), "Mouta ");
        caio.start();
        mouta.start();
        while (true){
            String email = JOptionPane.showInputDialog(" Entrnou com seu email");
            if(email == null || email.isEmpty()){
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}
