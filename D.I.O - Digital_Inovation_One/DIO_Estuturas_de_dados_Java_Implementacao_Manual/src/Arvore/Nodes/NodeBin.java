package Arvore.Nodes;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NodeBin<T> implements Comparable<T> {
    private T content;
    private NodeBin<T> leftNode;
    private NodeBin<T> rightNode;

    public NodeBin(T content) {
        this.content = content;
        this.leftNode = this.rightNode = null;
    }

    @Override
    public String toString() {
        return "[" + content + "]";
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
