package leetcode.interviewQuestion;

public class ReverseInteger {
    private static int reverse(int num){
        if (num > (Math.pow(2,31) -1 )){
            return 0;
        }
        System.out.println(Math.pow(2,31) - 1);
        int reverse = 0;
        if (num < 0){
            num = -(num);
            while (num > 0){
                reverse = reverse * 10;
                reverse = reverse + (num%10);
                num = num /10;
            }
            return -reverse;
        } else {
            while (num > 0){
                reverse = reverse * 10;
                reverse = reverse + (num%10);
                num = num /10;
            }
            return reverse;
        }
    }
    public static void main(String[] args) {
        //int a = -123;
        int a = 1534236469;
        System.out.println(reverse(a));
    }
}
