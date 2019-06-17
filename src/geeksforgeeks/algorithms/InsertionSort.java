package geeksforgeeks.algorithms;

import java.util.Scanner;

public class InsertionSort {
    private static int[] inserstionSort(int[] array){
        for (int i = 1; i < array.length ; i++) {
            int value = array[i];
            int hole = i;
            while (hole > 0 && array[hole - 1] > value){
                array[hole] = array[hole - 1];
                hole--;
            }
            array[hole] = value;
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int[] res = inserstionSort(array);
        for (int i : res){
            System.out.print(i + " ");
        }
    }
}
