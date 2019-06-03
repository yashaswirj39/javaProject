package hackerank;

import java.util.*;

public class NonDivisibleSet {
    private static int set(int[] array, int k){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                int sum = array[i] + array[j];
                if (sum % k != 0){
                    set.add(array[i]);
                    set.add(array[j]);
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        for (int i = 0; i < list.size() - 1; i++) {
            if ((list.get(i) + list.get(i + 1)) % k == 0){
                list.remove(i);
            }
        }
        return list.size();
       /*int[] f = new int[k];
       Arrays.fill(f, 0);

        for (int i = 0; i < array.length; i++) {
            f[array[i] % k]++;
        }

        for (int i = 0; i < f.length; i++){
            System.out.println(f[i]);
        }

        if (k % 2 == 0){
            f[k/2] = Math.min(f[k/2], 1);
        }

        int res = Math.min(f[0], 1);

        for (int i = 1; i < k/2; i++) {
            res += Math.max(f[i], f[k-1]);
        }
        return res;*/
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(set(array, k));
    }
}
