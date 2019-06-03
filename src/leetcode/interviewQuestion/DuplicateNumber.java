package leetcode.interviewQuestion;

import java.math.BigInteger;
import java.util.Arrays;

public class DuplicateNumber {
    private static int findDuplicate(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //int[] arr = {1,3,4,2,2};
        int[] arr = {3, 1, 3, 4, 2};
        System.out.println(findDuplicate(arr));
        String str = "yashaswi";
        System.out.println("HashCode --> " + str.hashCode() +
                " mod of hashcode ---> " + Math.abs(str.hashCode() % str.length()));
    }
}
