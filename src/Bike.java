import java.util.*;

/**
 * Input:
 * 3
 * I have a bike
 * bike is black
 * My bike is awesome
 */

public class Bike {
    static List<Map<String, String>> mapList = new ArrayList<>();

    /**
     * This method stores each line input string in a map object, which is stored inside a list of map object.
     * Map key is each word from a line and value is it's desired output that needs to be shown to end user.
     * @param list
     * @return mapList;
     */
    private static List<Map<String, String>> storeInListMap(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            Map<String, String> map = new HashMap<>();
            if (!list.get(i).isEmpty()) {
                ArrayList<String> al = new ArrayList<>(Arrays.asList(list.get(i).split(" ")));
                for (int j = 0; j < al.size(); j++) {
                    if (j == 0) {
                        map.put(al.get(j), "SYS_BEG " + al.get(j) + " " + al.get(j + 1));
                    } else if (j > 0 && j < al.size() - 1) {
                        map.put(al.get(j), al.get(j - 1) + " " + al.get(j) + " " + al.get(j + 1));
                    } else if (j == al.size() - 1) {
                        map.put(al.get(j), al.get(j - 1) + " " + al.get(j) + " SYS-END");
                    }
                }
                mapList.add(map);
                System.out.println(map);
            }
        }
        return mapList;
    }

    /**
     * This method match the input string with keys inside the list of map object from which the
     * desired output is displayed to end user.
     * @param mapList
     * @param str
     * @return list of output string.
     */
    private static List<String> getResult(List<Map<String, String>> mapList, String str) {
        List<String> list = new ArrayList<>();
        for (Map<String, String> res : mapList) {
            if (res.containsKey(str)) {
                list.add(res.get(str));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n + 1; i++) {
            list.add(scanner.nextLine());
        }
        List<Map<String, String>> mapList = storeInListMap(list);

        for (; ; ) {
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Please type EXIT for terminating the program, else type any letter from input");
            System.out.println("--------------------------------------------------------------------------------\n");
            String str = scanner.nextLine();
            System.out.println();
            if (str.equalsIgnoreCase("exit")) {
                break;
            } else {
                /**
                 * accepts the list of string to be shown in output and iterate over list to display the output.
                 */
                List<String> res = getResult(mapList, str);
                for (String s : res) {
                    System.out.println(s);
                }
                System.out.println();
            }
        }
    }
}