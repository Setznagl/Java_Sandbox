package Lista_Duplamente_Encadeada.Nodes;


public class Main {
    public static void main(String[] args) {
        Node.NodeList newBidirectionalNodeList = new Node.NodeList();

        Node node1 = new Node("Arcane");
        Node node2 = new Node("Code Geass");
        Node node3 = new Node("Full Metal Alchemist");
        Node node4 = new Node("Death Parade");
        newBidirectionalNodeList.addNode(node1);
        newBidirectionalNodeList.addNode(node2);
        newBidirectionalNodeList.addNode(node3);
        newBidirectionalNodeList.addNode(node4);

        /*Implementar o toString() com nextNode e PreviousNode simultaneamente causaria renderizações infinitas,
        para previnir isso somente content e indice foram implementados no toString e nextNode e previousNode
        aparecem quando o elemento é solicitado pelo índice*/
        System.out.println(newBidirectionalNodeList.printByIndexByHead(2));
        newBidirectionalNodeList.printAllNodes();
        System.out.println(newBidirectionalNodeList.indexOfContent("Death Parade"));
        System.out.println(newBidirectionalNodeList.getListNodeSize());

    }
}