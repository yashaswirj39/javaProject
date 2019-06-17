package geeksforgeeks.sudoplacements.sparraysandsearching.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayBug {
    private static ArrayList<Integer> rotate(int[] array, int pos){
        ArrayList<Integer> A = (ArrayList<Integer>) Arrays.stream(array).boxed().collect(Collectors.toList());
        int i = 0;
        while (pos-- > 0){
            int temp = A.get(i);
            A.remove(i);
            A.add(A.size(), temp);
        }
        return A;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*int n = scanner.nextInt();
        int[] arra = new int[n];
        for (int i = 0; i < n; i++) {
            arra[i] = scanner.nextInt();
        }*/
        int[] arra = {14, 5, 14, 34, 42, 63, 17, 25, 39, 61, 97, 55, 33, 96, 62, 32, 98, 77, 35};
        int pos = 56;//scanner.nextInt();
        System.out.println(rotate(arra, pos));
    }
}
