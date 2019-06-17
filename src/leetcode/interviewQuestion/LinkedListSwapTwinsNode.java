package leetcode.interviewQuestion;

import java.util.Scanner;

public class LinkedListSwapTwinsNode {
    private class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head;

    private void add(int data) {
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

    private Node reverseInTwins(Node node){
        int count = 0;
        Node temp = node;
        Node res = null;
        Node prev;
        while (temp != null && temp.next != null){
            if (count == 0) {
                temp = node.next.next;
                prev = node.next;
                node.next = node;
                prev.next = node;
                prev.next.next = temp;
                node = prev;
                res = prev;
                node = node.next;
                count++;
            } else {
                temp = temp.next.next;
                Node sec = node.next;
                node.next = node.next.next;
                node.next.next = sec;
                sec.next = temp;
                node = node.next.next;
            }
        }
        return res;
    }

    private void printList(Node node){
        while (node != null){
            System.out.print(node.data + " -> ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        LinkedListSwapTwinsNode list = new LinkedListSwapTwinsNode();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        Node node = list.reverseInTwins(list.head);
        list.printList(node);
    }
}