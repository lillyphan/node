import java.util.Objects;

public class Node {
    private Node parent;
    private Node child;
    private int data; //change this obviously

    public Node(){
    }

    public Node(int data){
        this.data = data;
    }

    public Node(int data, Node child, Node parent){
        this.data = data;
        this.parent = parent;
        this.child = child;
    }

    //accessors
    public int getData() {
        return data;
    }

    public Node getChild() {
        return child;
    }

    public Node getParent() {
        return parent;
    }

    //mutators
    public void setChild(Node child) {
        this.child = child;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    //other


    @Override
    public String toString() {
        return "Node: " + data;
    }

    @Override
    public boolean equals(Node n) {
        return this.data == n.data;
    }

}
