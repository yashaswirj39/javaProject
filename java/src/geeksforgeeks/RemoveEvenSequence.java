package geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEvenSequence {
    private static String removeEvenSeq(ArrayList<String> list) {
        int count = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equalsIgnoreCase(list.get(i + 1))) {
                count++;
            } else if (count % 2 == 0) {
                while (count > 0) {
                    list.remove(i);
                    i--;
                    count--;
                }
                return removeEvenSeq(list);
            } else {
                count = 1;
            }
        }
        return list.toString()
                .replaceAll("\\[","")
                .replaceAll("\\]", "")
                .replaceAll(", ", "");
    }

    public static void main(String[] args) {
        //String str = "azxxzyyyddddyzzz";
        String str = "aaabbbaaabbabddccc";
        long mil = System.currentTimeMillis();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(removeEvenSeq(list));
        System.out.println(System.currentTimeMillis() - mil);
    }
}