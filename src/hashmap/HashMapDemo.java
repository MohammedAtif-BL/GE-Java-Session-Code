package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> obj = new HashMap<>();

        obj.put("A",25);
        obj.put("B",26);
        obj.put("C",27);
        obj.put("C",28);

//        System.out.println(obj.get("B")); //Retrieve Value based on key
//
//        System.out.println(obj.values());
        // Iterate
        for ( String key : obj.keySet()){
            System.out.print(obj.get(key) + "=> ");
            System.out.println(key);
        }

        // put() // adding data
        //get() // return value based on key
        // remove() // delete the entry for given key
//        containsKey() // check if key exists
        // constainsValue() // check for value
        // keySet() // return the set of keys
        // values() // return the Collection of values
        //entrySet() Return Set of Map.Entry

//        for (Map.Entry<String, Integer> entry : obj.entrySet() ){
//            System.out.println(entry.getKey() + " => "+ entry.getValue());
//        }
    }
}
