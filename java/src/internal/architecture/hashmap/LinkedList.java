package internal.architecture.hashmap;

public class LinkedList<K, V> {
    private class Node {
        Node next;
        int hash;
        int index;
        K key;
        V value;

        public Node(int index, int hash, K key, V value) {
            this.index = index;
            this.hash = hash;
            this.key = key;
            this.value = value;
        }
    }
    Node head;

    protected void add(int index, int hash, K key, V value) {
        Node node = new Node(index, hash, key, value);
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    protected boolean checkHashCode(Node node, int hashCode, V value){
        boolean flag = false;
        while (node != null){
            if (node.hash == hashCode){
                node.value = value;
                flag = true;
                break;
            }
            node = node.next;
        }
        return flag;
    }

    protected void printList(Node node) {
        while (node != null) {
            System.out.println(node.index + " = " + node.key + " = " + node.value);
            node = node.next;
        }
    }
}
