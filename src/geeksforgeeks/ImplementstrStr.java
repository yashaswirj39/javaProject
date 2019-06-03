package geeksforgeeks;

public class ImplementstrStr {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        if (haystack.contains(needle)){
            System.out.println(haystack.indexOf("ll"));
        }
    }
}
