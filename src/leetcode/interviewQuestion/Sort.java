package leetcode.interviewQuestion;
/**
 * input : [0,1,2,0,2,1]
 * output:[0,0,1,1,2,2]
 */

import java.util.Scanner;

public class Sort {
    static int n;
    static int[] array;

    static int pos = 0;
    private static int[] sort(int[] a){
        for (int i = pos; i < a.length; i++) {
            if (a[i] == 0 && i == 0){
                continue;
            } else if (a[i] == 0 && i > 0){
                int temp = a[pos];
                a[pos] = a[i];
                a[i] = temp;
                pos++;
            } else if (a[i] == 1){

            }
        }
        return null;
    }

    private static void quickSort(int[] a, int left, int right){
        int index = partition(a, left, right);
        if (left < index - 1){
            quickSort(a,left,right);
        }
        if (index<right){
            quickSort(a,left,right);
        }
    }

    private static int partition(int a[], int left, int right){
        int pivot = a[(left + right)/2];
        while (left <= right){
            while (a[left] < pivot) left++;
            while (a[right] > pivot) right--;
            if (left <= right){
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;

                left++;
                right--;
            }
        }
        return pivot;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        quickSort(array, 0, array.length-1);
    }
}
