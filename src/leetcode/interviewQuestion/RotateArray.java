package leetcode.interviewQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    private static String rotate(int[] array, int k){
        while (k>=0) {
            for (int i = array.length - 1; i > 0; i--) {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
            }
            k--;
        }
        return Arrays.toString(array)
                .replaceAll(",","")
                .replaceAll("\\[", "")
                .replaceAll("\\]", "");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();

        while (testCase-- > 0) {

            int n = scanner.nextInt();

            int[] array = new int[n];

            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }

            int k = scanner.nextInt();

            System.out.println(rotate(array, k));
        }
    }
}
