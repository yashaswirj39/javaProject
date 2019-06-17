package geeksforgeeks.sudoplacements.sparraysandsearching.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class MaxNonNegativeSubArray {
    private static List<Integer> res(int[] array){
        Map<String, Integer> map = new LinkedHashMap<>();
        ArrayList<Integer> A = (ArrayList<Integer>) Arrays.stream(array).boxed().collect(Collectors.toList());
        int sum = 0;
        /*StringBuffer sb = new StringBuffer();
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) >= 0){
                sum = sum + A.get(i);
                sb.append(i).append(",").append(A.get(i)).append("|");
            } else {
                sb.append("=").append(sum);
                sum = 0;
                sb.append("-");
            }
        }
        sb.append("=").append(sum);*/
        String str = "";
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) >= 0) {
                sum = sum + A.get(i);
                str += A.get(i) + "-";
            } else {
                map.put(str, sum);
                str = "";
                sum = 0;
            }
        }
        map.put(str, sum);
        ArrayList<Integer> value = (ArrayList<Integer>) map.values();
        Collections.sort(value, Collections.reverseOrder());
        String key = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue() == value.get(0)){
                key = entry.getKey();
            }
        }
        List<String> res = new ArrayList<>(Arrays.asList(key.split("-")));
        System.out.println(res);
        return null;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 5, -7, 2, 3};
        res(array);
    }
}
