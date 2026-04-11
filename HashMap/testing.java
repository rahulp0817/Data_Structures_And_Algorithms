package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class testing {
  public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "rahul"); // add data in map
    map.put(2, "sachin");
    System.out.println(map); // {1=rahul, 2=sachin}

    System.out.println(map.get(1)); // get data in map
    System.out.println(map.get(8)); // null

    System.out.println(map.containsKey(1)); // check key in map
    System.out.println(map.containsValue("rahul")); // check value in map

    // loops in map

    // use KeySet() to get all keys in map and then get value by key
    // 1st way
    Set<Integer> keys = map.keySet();
    for (int key : keys) {
      System.out.println(map.get(key));
    }

    // better way
    map.keySet().forEach(key -> {
      System.out.println(map.get(key));
    });

    // EntrySet
    // 1st way
    map.entrySet().forEach(entry -> {
      System.out.println(entry.getKey() + " " + entry.getValue());
    });

    // 2nd way
    Set<Map.Entry<Integer, String>> entries = map.entrySet();
    for (Map.Entry<Integer, String> entry : entries) {
      System.out.println(entry.getKey() + " " + entry.getValue()); // get key and value
    }
    // make entries uppercase
    for (Map.Entry<Integer, String> entry : entries) {
      entry.setValue(entry.getValue().toUpperCase()); // update value in map
    }

    // remove data in map
    map.remove(1); // remove data by key
    map.remove(2, "SACHIN"); // remove data by key and value
    System.out.println(map);

    System.out.println(map.size()); // size of map

    System.out.println(map.getOrDefault(1, null)); // get value by key if key is present otherwise return default value

    map.putIfAbsent(3, "ram"); // add data in map if key is not present
    System.out.println(map);
    // map.clear(); // clear map

  }
}
