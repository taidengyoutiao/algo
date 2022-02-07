import java.util.*;

// Since the type of item is not fixed, only when writing the client code
public class LinkedNode<I> {
    public I item;
    public LinkedNode<I> next;
    public LinkedNode(I item) {
        this.item = item;
        this.next = null;
    }
    public void linkTo(LinkedNode<I> nextNode) {
        this.next = nextNode;
    }
    public String toString() {
        return this.item.toString();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("world");
        LinkedNode<List<String>> n = new LinkedNode<>(list);

        List<String> list1 = new ArrayList<>();
        list.add("Hello1");
        list.add("world1");
        LinkedNode<List<String>> n1 = new LinkedNode<>(list1);

        n.linkTo(n1);
        System.out.println(n);
    }
}
