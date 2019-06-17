package geeksforgeeks.sudoplacements.sparraysandsearching.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    private static String rotate(int[] array, int k){
        int[] firstCopy = Arrays.copyOfRange(array, k, array.length);
        int[] secondCopy = Arrays.copyOfRange(array, 0, k);
        int[] res = new int[array.length];
        System.arraycopy(firstCopy, 0, res, 0, firstCopy.length);
        System.arraycopy(secondCopy, 0, res, firstCopy.length, secondCopy.length);

        return Arrays.toString(res)
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

            int k = scanner.nextInt();

            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.println(rotate(array, k));
        }
    }
}