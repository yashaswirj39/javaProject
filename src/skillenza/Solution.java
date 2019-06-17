package skillenza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Solution {
    static String result(List<Integer> list, int sum){
        List<Integer> compareList = new ArrayList<>(list);
        Collections.sort(compareList, Collections.reverseOrder());
        boolean flag = false;
        for (int k : compareList){
            list.remove(list.indexOf(k));
            sum = sum - k;
            if (list.contains(sum)){
                flag = true;
                break;
            } else {
                if (sum <  0){
                    sum = sum + k;
                    flag = false;
                } else if (sum == 0){
                    flag = true;
                    break;
                } else {
                    //sum = sum - k;
                    flag = false;
                    continue;
                }
            }
        }
        if (flag == true) {
            return "YES";
        } else {
            return "NO";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        long millis = System.currentTimeMillis();
        while (t-- > 0) {
            int n = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(scanner.nextInt());
            }
            int sum = scanner.nextInt();
            System.out.println(result(list, sum));
        }
        System.out.println(System.currentTimeMillis() - millis);
    }
}