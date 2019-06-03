package geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MoveZeroes {
    private static void moveZeroes(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0){
                list.remove(i);
                list.add(0);
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        moveZeroes(list);
    }
}
