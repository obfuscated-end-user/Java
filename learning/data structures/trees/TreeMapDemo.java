import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args){
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("BCS21", 33);
        treeMap.put("BCS22", 33);
        treeMap.put("BIT21", 36);
        treeMap.put("BIT22", 33);
        treeMap.put("BIT23", 30);
        printAll(treeMap);
        // Keys cannot be duplicates. This will not be stored.
        treeMap.put("BCS21", 33);

        // Values may be duplicates. This will be stored.
        treeMap.put("BIT34", 33);
        System.out.println("Successfully added BIT34, 34");
        printAll(treeMap);
    }

    public static void printAll(TreeMap<String, Integer> treeMap) {
        for (Map.Entry<String, Integer> elements : treeMap.entrySet()) {
            System.out.println(elements.getKey() + ": " + elements.getValue());
        }
        System.out.println();
    }
}