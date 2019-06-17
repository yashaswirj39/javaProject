package geeksforgeeks.sudoplacements.sparraysandsearching.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeadersInAnArray {
    private static String findLeaders(int[] array){
        StringBuilder sb = new StringBuilder();
        int max = array[array.length - 1];
        for (int i = array.length - 1; i >= 0 ; i--) {
            if (array[i] >= max){
                max = array[i];
                if (max > 9){
                    StringBuilder gret = new StringBuilder();
                    gret.append(max);
                    gret.reverse();
                    sb.append(gret).append(" ");
                } else {
                    sb.append(max).append(" ");
                }
            }
        }
        return sb.reverse().toString().trim();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(br.readLine());

        while (testCases-- > 0) {
            int n = Integer.parseInt(br.readLine());

            int[] array = new int[n];

            String line = br.readLine();
            String[] str = line.trim().split("\\s");
            for (int i = 0; i < n; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            System.out.println(findLeaders(array));
        }
    }
}
