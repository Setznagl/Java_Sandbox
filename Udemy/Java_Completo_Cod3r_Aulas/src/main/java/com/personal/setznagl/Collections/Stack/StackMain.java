package com.personal.setznagl.Collections.Stack;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<User> UserStack = new Stack<>();
        User user1 = new User("Orlando");
        User user2 = new User("Martin");
        User user3 = new User("Barbara");
        //Disparam exception e não são os mais indicados para pilhas
        UserStack.add(user1);   UserStack.add(user2);   UserStack.add(user3);
        UserStack.remove(user1);
        System.out.println("Pilha 01: " + UserStack + "\n");

        Stack<User> UserStack2 = new Stack<>();
        UserStack2.push(user1);
        System.out.println(UserStack2.peek());
        UserStack2.pop();
        // UserStack2.pop(); //pop() retornará exception se não houver elementos na pilha
        System.out.println("Pilha 02: " + UserStack2 + "\n");
    }
}
