import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args){
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("FtutLA63Cp8", 33);
        treeMap.put("ThHvx5a9IYA", 33);
        treeMap.put("i41KoE0iMYU", 36);
        treeMap.put("9lNZ_Rnr7Jc", 33);
        treeMap.put("TKfdEDIdBzI", 30);
        printAll(treeMap);
        // Keys cannot be duplicates. This will not be stored.
        treeMap.put("FtutLA63Cp8", 33);

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