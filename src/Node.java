import java.util.Objects;

public class Node<E> {
    private Node<E> parent;
    private Node<E> child;
    private E data;

    public Node(){
    }

    public Node(E data){
        this.data = data;
    }

    public Node(E data, Node<E> child, Node<E> parent){
        this.data = data;
        this.parent = parent;
        this.child = child;
    }

    //accessors
    public E getData() {
        return data;
    }

    public Node<E> getChild() {
        return child;
    }

    public Node<E> getParent() {
        return parent;
    }

    //mutators
    public void setChild(Node<E> child) {
        this.child = child;
    }

    public void setData(E data) {
        this.data = data;
    }

    public void setParent(Node<E> parent) {
        this.parent = parent;
    }

    //other

    @Override
    public String toString() {
        return "Node: " + data;
    }

    public boolean equals(Node<E> node) {
        return Objects.equals(data, node.data);
    }

}
