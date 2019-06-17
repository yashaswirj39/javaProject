package skillenza;

import java.util.Arrays;

public class TheKingsMarch {
    static int MaximumPath(int Mat[][], int N) {
        int result = 0;

        // creat 2D matrix to store the sum
        // of the path
        int dp[][] = new int[N][N + 2];

        // initialize all dp matrix as '0'
        for (int[] rows : dp)
            Arrays.fill(rows, 0);

        // copy all element of first column into
        // 'dp' first column
        for (int i = 0; i < N; i++)
            dp[0][i + 1] = Mat[0][i];

        int count = 0;
        for (int i = 1; i < N; i++) {
            for (int j = 1; j <= N; j++) {
                dp[i][j] = Math.max(dp[i - 1][j - 1],
                        Math.max(dp[i - 1][j],
                                dp[i - 1][j + 1])) +
                        Mat[i][j - 1];
                count ++;
            }
        }

        // Find maximum path sum that end ups
        // at any column of last row 'N-1'
        for (int i = 0; i <= N; i++) {
            result = Math.max(result, dp[N - 1][i]);
            System.out.println("result --> " + result);
            System.out.println("path --> " + dp[N - 1][i]);
        }


        // return maximum sum path
        return result;
    }

    public static void main(String[] args) {
        /*int Mat[][] = { { 4, 2, 3, 4 },
                { 2, 9, 1, 10 },
                { 15, 1, 3, 0 },
                { 16, 92, 41, 44 } };*/

        int Mat[][] = {{0, 2, 3 },
                {2, 0, 2},
                {1, 2, 0}};

        /*int Mat[][] = {{0, 1, 2 },
                {1, 0, 1},
                {2, 1, 0}};*/

        System.out.println(MaximumPath(Mat, 3));
    }
}
