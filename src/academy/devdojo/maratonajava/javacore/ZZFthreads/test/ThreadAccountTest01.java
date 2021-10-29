package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Account;

public class ThreadAccountTest01 implements Runnable{
    private Account account = new Account();
    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 =  new Thread(threadAccountTest01, "Caio");
        Thread t2 = new Thread(threadAccountTest01,"Mouta");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            withdrawl(10);
            if(account.getBalance() < 0){
                System.out.println("Eita");
            }
        }
    }

    private void withdrawl(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(getThreadName() + " está indo saca dinheiro");
            account.withdrawl(amount);
            System.out.println(getThreadName() + " completou o saque" + account.getBalance());
        } else {
            System.out.println("Sem dinheiro para " + getThreadName() + " Efetuar o saque " + account.getBalance());

        }
    }

        private String getThreadName(){
            return Thread.currentThread().getName();
    }

}

