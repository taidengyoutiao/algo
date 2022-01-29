// Since the type of item is not fixed, only when writing the client code
public class LinkedNode<I> {
    public I item;
    public LinkedNode<I> next;
    public LinkedNode(I item) {
        this.item = item;
        this.next = null;
    }
    public String toString() {
        return this.item.toString();
    }

    public static void main(String[] args) {
        LinkedNode<String> n = new LinkedNode<>("a");
        n.next = new LinkedNode<>("b");
        System.out.println(n.next);
    }
}
