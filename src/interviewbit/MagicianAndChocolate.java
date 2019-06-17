package interviewbit;

import java.util.Scanner;

public class MagicianAndChocolate {
    public static long nchoc(int A, long[] B) {
        long sum = 0L;
        int  i = 0;
        while(A > 0){
            if(i < B.length){
                sum += B[i];
                B[i] = (long) Math.floor(B[i]/2);
                i++;
                A--;
            } else {
                i = 0;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int n = scanner.nextInt();
        long[] B = new long[n];
        for (int i = 0; i < n; i++) {
            B[i] = scanner.nextLong();
        }
        System.out.println(nchoc(k, B));
    }
}
