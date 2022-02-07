import java.util.Iterator;
import java.util.NoSuchElementException;

// TODO: How to write the code when each node can have a different item type?
public class LinkedList<Item> implements Iterable<Item> {
    public LinkedNode<Item> first;
    public LinkedList () {
        this.first = null;
    }
    public void add (LinkedNode<Item> node) {
        LinkedNode<Item> OldFirst = this.first;
        this.first = node;
        this.first.next = OldFirst;
    }

    public Iterator<Item> iterator () {
        return new LinkedIterator(first);
    }
    private class LinkedIterator implements Iterator<Item> {
        private LinkedNode<Item> current;

        public LinkedIterator (LinkedNode<Item> first) {
            current = first;
        }

        public boolean hasNext() {
            return current != null;
        }
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public Item next() {
            if(!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        LinkedNode<String> node = new LinkedNode<>("ha");
        LinkedNode<String> node1 = new LinkedNode<>("haha");
        list.add(node);
        list.add(node1);
//        for (String n : list)System.out.println(n);
        LinkedNode<String> n = list.first;
        while(n != null) {
            System.out.println(n);
            n = n.next;
        }
    }
}
