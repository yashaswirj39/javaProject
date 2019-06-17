package leetcode.interviewQuestion;

//Graaph problem
import java.util.Scanner;

public class MergeList {
    private static int[][] merge(int[][] array, int n, int m){
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            if (array[i][m - 1] >= array[i+1][0]){
                //res[i] = array[]
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        merge(array, n, m);
    }
}
