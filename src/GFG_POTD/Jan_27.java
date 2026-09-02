package GFG_POTD;
import java.util.*;
public class Jan_27 {
    // Constructor for initializing the cache capacity with the given value.
    static Map<Integer,Integer> map;
    static int capacity;
//    LRUCache(int cap) {
//        // code here
//        map = new LinkedHashMap<>();
//        capacity = cap;
//
//    }

    // Function to return value corresponding to the key.
    public static int get(int key) {
        // your code here
        if(!map.containsKey(key)){
            return -1;
        }
        int val = map.get(key);
        map.remove(key);
        map.put(key,val);
        return val;
    }

    // Function for storing key-value pair.
    public static void put(int key, int value) {
        // your code here
        if(map.containsKey(key)){
            map.remove(key);
            map.put(key,value);
        }
        else{
            if(capacity == map.size()){
                int firstKey=-1;
                for(int a:map.keySet()){
                    firstKey = a;
                    break;
                }
                map.remove(firstKey);
                map.put(key,value);
            }
            map.put(key,value);
        }
    }
}
