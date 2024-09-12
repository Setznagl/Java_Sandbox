package Nodes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Node node1 = new Node("Marrocos");
        Node node2 = new Node("Suecia");
        Node node3 = new Node("Estonia");
        node1.setNextNode(node2);
        node2.setNextNode(node3);

        System.out.println(" ");
        System.out.println("Digite o conteúdo do novo nó: ");
        //Node.addNode(node1 , input.nextLine());
        Node.addNodeOnSpecificIndex(node1 , input.nextLine() , 2);
        Node.iterableConsole(node1);

    }
}