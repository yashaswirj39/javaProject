package leetcode.interviewQuestion;

import java.util.Scanner;

public class RotateArray {
    private static int[] rotate(int[] array, int k){


        while (k>0) {
            for (int i = array.length - 1; i > 0; i--) {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
            }
            k--;
        }

        for (int num: array){
            System.out.print(num + " ");
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int k = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        rotate(array,k);
    }
}
