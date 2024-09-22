package com.personal.setznagl.Lambda.Thread;

public class Trabalho01 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Tarefa #01");
            try {Thread.sleep(400);}
            catch (InterruptedException e) {throw new RuntimeException(e);}
        }
    }
}
