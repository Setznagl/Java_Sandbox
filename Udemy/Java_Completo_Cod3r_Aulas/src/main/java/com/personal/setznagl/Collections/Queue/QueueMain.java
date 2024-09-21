package com.personal.setznagl.Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueMain {
    public static void main(String[] args) {
        Queue<User> userQueue = new LinkedList<User>();

        User user1 = new User("Samuel");
        User user2 = new User("Júlia");
        User user3 = new User("Junior");
        User user4 = new User("Samanta");
        //Retorna false ao falhar
        userQueue.offer(user1);
        userQueue.offer(user2);
        userQueue.offer(user3);
        userQueue.offer(user4);
        System.out.println(userQueue);

        Queue<User> emptyQueue = new LinkedList<>();
        System.out.println(emptyQueue.poll()); //Retorna 'null' se estiver vazio
        //System.out.println(emptyQueue.remove()); //Retorna exception
        System.out.println(emptyQueue.peek()); //Retorna 'null' se estiver vazio
        //System.out.println(emptyQueue.element()); //Retorna exception


    }
}
