package geeksforgeeks.sudoplacements.sparraysandsearching;

import java.util.Scanner;

public class ImmediateSmallerElement {
    private static String immediateSmallerElement(int[] array){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]){
                sb.append(array[i+1]).append(" ");
            } else
                sb.append(-1).append(" ");
        }
        return sb.append(-1).toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            int sizeOfArray = scanner.nextInt();
            int array[] = new int[sizeOfArray];
            for (int i = 0; i < sizeOfArray; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println(immediateSmallerElement(array)+"\n");
        }
    }
}
