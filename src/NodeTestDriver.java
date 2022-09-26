public class NodeTestDriver {
    public static void main(String[] args) {
        //testing constructors
        Node<Integer> parent = new Node<>();
        Node<Integer> child = new Node<>(5);
        Node<Integer> middle = new Node<>(10, child, parent);

        //testing mutators, accessors, and toString
        parent.setData(15);
        System.out.println("Node: 15 -- " + middle.getParent());
        middle.setParent(child);
        System.out.println("Node: 5 -- " + middle.getParent());
        System.out.println("Node: 5 -- " + middle.getChild());
        middle.setChild(parent);
        System.out.println("Node: 15 -- " + middle.getChild());
        System.out.println("10 -- " + middle.getData());

        //testing equals()
        System.out.println("false -- " + parent.equals(child));
        parent.setData(child.getData());
        System.out.println("true -- " + parent.equals(child));

    }
}
