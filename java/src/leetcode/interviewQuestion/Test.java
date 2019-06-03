package leetcode.interviewQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //String a = "azxxzyyyddddyzzz";
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        //String a = "xAAAAx";
        ArrayList a2 = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            a2.add(a.charAt(i));
        }
        a2 = removeData(a2);
        String s = "";
        if (a2.size() != 0) {
            for (int i = 0; i < a2.size(); i++) {
                s += a2.get(i);
            }
        }
        System.out.print(s);
    }

    public static ArrayList removeData(ArrayList a2) {
        if (a2.size() == 2) {
            if (a2.get(0) == a2.get(1))
                return null;
        }

        for (int i = 0; i < a2.size(); i++) {
            int count = 1;
            for (int j = 0; j < a2.size() - 1; j++) {
                if (a2.get(j) == a2.get(j + 1)) {
                    count++;
                } else if (count % 2 == 0) {
                    for (int k = 0; k < count; k++) {
                        a2.remove(j - k);
                    }
                    return removeData(a2);
                }else count = 1;
            }

        }
        return a2;
    }
}
