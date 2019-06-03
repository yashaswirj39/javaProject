package leetcode.interviewQuestion;

import java.util.*;
import java.util.stream.Collectors;

public class Subsets {
    private static List<List<Integer>> subsets(int[] num){
        List<List<Integer>> res = new ArrayList<>();
        if (num.length == 1){
            res.add(new ArrayList<>());
            List<Integer> list = new ArrayList<>();
            list.add(num[0]);
            res.add(list);
            return res;
        }
        List<Integer> arrToList = Arrays.stream(num).boxed().collect(Collectors.toList());
        if (num.length == 2){
            res.add(new ArrayList<>());
            for (int i = 0; i < num.length; i++) {
                List<Integer> list = new ArrayList<>();
                list.add(num[i]);
                res.add(list);
            }
            res.add(arrToList);
            return res;
        }
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i+1; j < num.length; j++) {
                List<Integer> list = new ArrayList<>();
                list.add(num[i]);
                list.add(num[j]);
                res.add(list);
            }
        }


        for (int i = 0; i < num.length; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(num[i]);
            res.add(list);
        }
        res.add(arrToList);
        res.add(new ArrayList<>());
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(subsets(arr));
    }
}
