package leetcode.interviewQuestion.algo;

import com.sun.scenario.effect.Merge;

public class MergeSort {
    private static void printArray(int[] array){
        for (int i : array)
            System.out.println(i + " ");
        System.out.println();
    }

    private static void sort(int[] array, int n){
        if (n < 2){
            return;
        }

        int mid = n/2;

        int[] l = new int[mid];
        int[] r = new int[array.length-mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }

        for (int i = mid; i < n; i++) {
            r[i - mid] = array[i];
        }

        sort(l, mid);
        sort(r, n-mid);

        for (int i: l){
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i: r){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        MergeSort.sort(actual, actual.length);
    }
}
