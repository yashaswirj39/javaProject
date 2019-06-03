package geeksforgeeks;

public class RepeatedSubstringPattern {
    private static boolean substring(String s){
        String str = s+s;
        System.out.println(str);
        String str1 = str.substring(1, 2*s.length() - 1);
        System.out.println(str1);
        String str2 = str1.concat(s);
        System.out.println(str2);
        return (s+s).substring(1,2*s.length()-1).contains(s);
    }
    public static void main(String[] args) {
        //String str = "abab";
        String str = "abab";
        System.out.println(substring(str));
    }
}
