package Nodes;

import lombok.Data;

@Data
public class Node {

    private String content;
    private Node nextNode;

    public Node(String content) {
        this.content = content;
        this.nextNode = null;
    }

    @Override
    public String toString() {
        return "Node [content = " + content + " , nextNode = " + nextNode + " ]";
    }

    protected static void iterableConsole(Node nodeParameter){

        Node currentNode = nodeParameter;

        if(nodeParameter.getNextNode() == null){
            System.out.println(nodeParameter);
        }else{
            while( currentNode != null){
                System.out.println(currentNode);
                currentNode = currentNode.getNextNode();
            }
        }
    }

    protected static void getByNodeContent(Node nodeListRootParameter , String nodeContent){

        Node currentNode = nodeListRootParameter;

        while(!currentNode.content.equals(nodeContent)){
            System.out.println("...");
            currentNode = currentNode.getNextNode();
        }
        System.out.println("Localizado o elemento " + currentNode);
    }

    protected static void addNode(Node nodeListRootParameter , String nodeContent){

        Node currentNode = nodeListRootParameter;

        Node tmpNode = new Node(nodeContent);

        while(currentNode.nextNode != null){
            currentNode = currentNode.nextNode;
        }
        currentNode.nextNode = tmpNode;
    }

    protected static void addNodeOnSpecificIndex(Node nodeListRootParameter , String nodeContent , int indexParameter){

        int index = 0;
        Node currentNode = nodeListRootParameter;
        Node tmpNode = new Node(nodeContent);

    }


}
