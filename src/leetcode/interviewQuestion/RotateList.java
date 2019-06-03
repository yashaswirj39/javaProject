package leetcode.interviewQuestion;

import java.util.Scanner;

/*int count = 0;
        Node sp = head;
        Node fp = head;

        while (head != null && fp.next != null){
            count++;
            fp = fp.next;
            if(count > k){
                sp = sp.next;
            }
        }
        Node tmp = sp.next;
        sp.next = null;
        fp.next = head;*/
public class RotateList {
    public class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;
    int count = 0;

    public void add(int data) {
        Node node = new Node(data);

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

    public void printList(Node node) {
        while (node != null) {
            System.out.println(node.data + " -> " + node);
            node = node.next;
        }
    }

    public int size(Node node) {
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    public Node rotate(Node head, int k) {

        Node original = head;

        if (count < k) {
            k = k % count;
        } else if (count == k) {
            return head;
        }

        while (k > 0) {
            while (head.next.next != null) {
                head = head.next;
            }
            Node temp = head.next;
            head.next = null;
            temp.next = original;
            original = temp;
            head = original;
            k--;
        }
        return original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        RotateList rl = new RotateList();

        for (int i = 0; i < n; i++) {
            rl.add(sc.nextInt());
        }

        rl.printList(rl.head);
        System.out.println(rl.size(rl.head));
        System.out.println("After rotating...");
        Node node = rl.rotate(rl.head, 2000000000);
        rl.printList(node);
    }
}
