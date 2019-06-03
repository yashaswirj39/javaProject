package leetcode.interviewQuestion;

import java.util.Scanner;

public class ReverseList<T> {

    Node head;
    int count = 0;

    public static class Node<T> {
        Node next;
        T data;

        public Node(T val) {
            this.data = val;
        }
    }

    public void add(T data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            count++;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
            count++;
        }
    }

    private Node reverse(Node node) {
        Node next = null;
        Node prev = null;
        Node cur = node;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
        return head;
    }

    private Node getMiddle(Node node) {
        Node sp = node;
        Node fp = node;
        while (fp != null && fp.next != null) {
            fp = fp.next.next;
            sp = sp.next;
        }
        return sp;
    }

    private void printList(Node node) {
        while (node != null) {
            System.out.println(node.data + " ---> " + node);
            node = node.next;
        }
    }

    private boolean checkPallindrome(Node node) {
        if (node == null) {
            return false;
        }

        if (count == 1) {
            return true;
        }

        if (count == 2) {
            if (node.data.equals(node.next.data)) {
                return true;
            } else return false;
        }

        boolean flag = false;
        ReverseList reverseList = new ReverseList();
        Node pal = null;
        Node mid = reverseList.getMiddle(node);
        if (count % 2 == 0) {
            pal = mid.next;
            Node rev = reverseList.reverse(pal);
            while (rev.next != null) {
                if (rev.data == node.data) {
                    flag = true;
                } else {
                    flag = false;
                }
                rev = rev.next;
                node = node.next;

            }
        } else {
            pal = mid;
            Node rev = reverseList.reverse(pal);
            while (rev.next != null) {
                if (rev.data.equals(node.data)) {
                    flag = true;
                } else {
                    flag = false;
                }
                rev = rev.next;
                node = node.next;

            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        /*ReverseList<Integer> reverseList = new ReverseList();

        for (int i = 0; i < n; i++) {
            reverseList.add(scanner.nextInt());
        }
        reverseList.printList(reverseList.head);
        Node node = reverseList.reverse(reverseList.head);
        System.out.println("After reversing");
        reverseList.printList(node);
        System.out.println("middle");
        Node mid = reverseList.getMiddle(reverseList.head);
        System.out.println(mid.data);
        System.out.println(reverseList.count);*/

        ReverseList<String> list = new ReverseList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.next());
        }
        System.out.println(list.checkPallindrome(list.head));
    }
}
