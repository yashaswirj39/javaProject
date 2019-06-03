package leetcode.interviewQuestion;

import java.util.*;

public class AnyTest {
    private static int minSwap(List<Integer> avg){
        Collections.sort(avg);
        int count = 0;
        for (int i = 0; i < avg.size(); i++) {
            if (avg.get(i).equals(0)){
                count++;
            }
        }
        return ++count;
    }

    /*private static int[] max(int[] nums, int[] maxes){
        int[] res = new int[maxes.length];
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < maxes.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j]<= maxes[i]){
                    count++;
                } else break;
            }
            res[i] = count;
            count = 0;
        }
        return res;
    }*/
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = scanner.nextInt();
        while (n > 0){
            int input = scanner.nextInt();
            if (input == 1){
                stack.push(scanner.nextInt());
            } else if (input == 2){
                stack.pop();
            } else {
                System.out.println(stack.peek());
            }
            n--;
        }*/
       /* Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] maxes = new int[m];
        for (int i = 0; i < m; i++) {
            maxes[i] = scanner.nextInt();
        }

        int[] res = max(nums,maxes);
        for (int i : res){
            System.out.println(i);
        }*/
       Scanner scanner = new Scanner(System.in);
       List<Integer> list = new ArrayList<>();
       int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println(minSwap(list));
    }
}