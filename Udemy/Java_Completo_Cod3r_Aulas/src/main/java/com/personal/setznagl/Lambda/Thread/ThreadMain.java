package com.personal.setznagl.Lambda.Thread;

public class ThreadMain {
    public static void main(String[] args) {
        //Threads executam tarefas em pararelo
        Runnable Trabalho01 = new Trabalho01();
        Runnable Trabalho02 = new Runnable() { //Criação de classe anônima a partir da interface
            @Override public void run() {for (int i = 0; i < 10; i++) {System.out.println("Tarefa #02");
            try {Thread.sleep(400);} catch (InterruptedException e) {throw new RuntimeException(e);}}}} ;
        Runnable trabalho03 = () -> {for (int i = 0; i < 10; i++) {System.out.println("Tarefa #03");}
            try {Thread.sleep(400);} catch (InterruptedException e) {throw new RuntimeException(e);}};
        Runnable trabalho04 = ThreadMain::trabalho04;

       Thread t1 = new Thread(Trabalho01);
       Thread t2 = new Thread(Trabalho02);
       Thread t3 = new Thread(trabalho03);
       Thread t4 = new Thread(trabalho04);
       t1.start();
       t2.start();
       t3.start();
       t4.start();
    }

    static void trabalho04(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Tarefa #04");
        }
    }
}
