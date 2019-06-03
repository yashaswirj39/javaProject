package geeksforgeeks;

import java.util.*;

public class SequenceList {
    static List<Set<Integer>> al = new ArrayList<>();

    private static List<Set<Integer>> getList(ArrayList<Integer> list) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        for (int i = 0; i < list.size() - 3; i++) {
            if (Math.abs(list.get(i) - list.get(i + 1)) == Math.abs(list.get(i + 1) - list.get(i + 2))) {
                lhs.add(list.get(i));
                lhs.add(list.get(i + 1));
                lhs.add(list.get(i + 2));
                list.remove(i);
                i--;
                al.add(lhs);
            } else {
                list.remove(i);
                return getList(list);
            }
        }

        Set<Set<Integer>> set = new HashSet<>();
        for (int i = 0; i < al.size() - 1; i++) {
            set.add(al.get(i));
        }
        List<Set<Integer>> res = new ArrayList<>(set);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int[] arr = {1, 3, 4, 5, -8, -9, -10, 12, 18, 20, 22, 3, 4, 6, 11, 10, 9, 8, 22, 20, 18, 12, 13, -7, -8, -9, -10, 11, 10, 9};
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(getList(list));
    }
}
