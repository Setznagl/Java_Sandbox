package Pilha.Nodes;

public class Node {
    private String content;
    private Node nextNode = null;

    Node(String contentParameter) {
        this.content = contentParameter;
    }

    public static class Stack {
        private Node top = null;

    }
}
