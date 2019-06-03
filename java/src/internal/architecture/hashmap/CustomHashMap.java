package internal.architecture.hashmap;

public class CustomHashMap<K, V> implements CustomMap<K, V> {

    private LinkedList[] list = new LinkedList[16];

    @Override
    public void put(K K, V V) {
        int initialCapacity = 16;
        int hashCode = K.hashCode();
        System.out.println(hashCode);
        int index = Math.floorMod(hashCode, initialCapacity);
        System.out.println(index);
        list[index] = add(index, hashCode, K, V);
    }

    public LinkedList add(int index, int hashcode, K k, V v){
        LinkedList customList = null;
        try {
            customList = list[index];
            boolean flag = customList.checkHashCode(customList.head, hashcode, v);
            if (!flag) {
                customList.add(index, hashcode, k, v);
            }
            return customList;
        } catch (IndexOutOfBoundsException | NullPointerException e){
            customList = new LinkedList();
            customList.add(index, hashcode, k, v);
            list[index] = customList;
            return customList;
        }
    }

    @Override
    public void printMap(){
        for (LinkedList res: list){
            LinkedList linkedList = res;
            if (linkedList == null){
                continue;
            } else {
                linkedList.printList(linkedList.head);
            }
        }
    }

    public static void main(String[] args) {
        CustomMap<String, Integer> chm = new CustomHashMap<>();
        chm.put("surya", 24);
        chm.put("yash", 24);
        chm.put("aish", 24);
        chm.put("karan", 24);
        chm.put("arjun", 24);
        chm.put("arjun", 25);
        chm.printMap();
    }
}
