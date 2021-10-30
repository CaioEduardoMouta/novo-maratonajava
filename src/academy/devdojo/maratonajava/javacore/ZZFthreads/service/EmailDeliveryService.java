package academy.devdojo.maratonajava.javacore.ZZFthreads.service;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Members;

public class EmailDeliveryService implements Runnable{
    private final Members members;

    public EmailDeliveryService(Members members){
        this.members = members;
    }

    @Override

    public void run(){
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + "starting to deliver email...");
        while(members.isOpen() || members.pendingEmails() > 0){
            try{
                String email = members.retrieveEmail();
                if(email == null) continue;
                
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
