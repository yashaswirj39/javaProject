package geeksforgeeks.algorithms;

import java.util.Scanner;

public class MergeSort {

    private static void merge(int[] array){
        int n = array.length;

        if (n<2){
            return;
        }

        int mid = n/2;

        int[] left = new int[mid];
        int[] right = new int[n-mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }

        for (int i = mid; i < n; i++) {
            right[i - mid] = array[i];
        }

        merge(left);
        merge(right);
        sort(left, right, array);
    }

    private static void sort(int[] left, int[] right, int[] array){
        int nl = left.length;
        int rl = right.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while (i<nl && j < rl){
            if (left[i] <= right[j]){
                array[k] = left[i];
                i++;
            } else{
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i<nl){
            array[k] = left[i];
            i++;
            k++;
        }

        while (j < rl){
            array[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        merge(array);
        for (int i : array){
            System.out.print(i + " ");
        }
    }
}
