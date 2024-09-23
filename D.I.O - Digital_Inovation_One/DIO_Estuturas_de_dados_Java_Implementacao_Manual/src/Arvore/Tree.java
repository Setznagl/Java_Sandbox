package Arvore;

import Arvore.Nodes.NodeBin;

public class Tree<T extends Comparable<T>> {
    private NodeBin<T> rootNode;
    private NodeBin<T> currentNode;

    Tree(){
        this.rootNode = null;
    }

    public void add(T content){
        NodeBin<T> newNode = new NodeBin<>(content);
        rootNode = add(rootNode , newNode);
    }

    private NodeBin<T> add(NodeBin<T> currentNode , NodeBin<T> newNode){
        if (currentNode == null){
            return newNode;
        } else if (newNode.getContent().compareTo(currentNode.getContent()) < 0) {
            currentNode.setLeftNode(add(currentNode.getLeftNode() , newNode));
        } else {
            currentNode.setRightNode(add(currentNode.getRightNode() , newNode));
        }
        return currentNode;
    }

    public void showInOrder(){
        System.out.println("\nDisplaying in order: ");
        showInOrder(this.rootNode);}
    private void showInOrder(NodeBin<T> currentNode){
        if(currentNode != null){
            showInOrder(currentNode.getLeftNode());
            System.out.println(currentNode.getContent());
            showInOrder(currentNode.getRightNode());
        }
    }

    public void showPreOrder(){
        System.out.println("\nDisplaying pre order: ");
        showPreOrder(this.rootNode);}
    private void showPreOrder(NodeBin<T> currentNode){
        if(currentNode != null){
            System.out.println(currentNode.getContent());
            showPreOrder(currentNode.getLeftNode());
            showPreOrder(currentNode.getRightNode());
        }
    }

    public void showPosOrder(){
        System.out.println("\nDisplaying post order: ");
        showPosOrder(this.rootNode);}
    private void showPosOrder(NodeBin<T> currentNode){
        if(currentNode != null){
            System.out.println(currentNode.getContent());
            showPosOrder(currentNode.getLeftNode());
            showPosOrder(currentNode.getRightNode());
        }
    }

    public void remove(T content){
        try {
           NodeBin<T> atual = this.rootNode;
           NodeBin<T> pai = null;
           NodeBin<T> filho = null;
           NodeBin<T> temp = null;

           while(atual != null && !atual.getContent().equals(content)){
               pai = atual;
               if(content.compareTo(atual.getContent()) < 0){
                   atual = atual.getLeftNode();
               }else {
                   atual = atual.getRightNode();
               }
           }
           if(atual == null){
               System.out.println("Conteúdo não encontrado no bloco Try()!");
           }

        }catch (NullPointerException erro){
            System.out.println("Conteúdo não encontrado no bloco Catch()!");
        }
    }
}
