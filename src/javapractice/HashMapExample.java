package javapractice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("abc", 1);
        map.put("cba", 2); // different key, may have same hash

        System.out.println(map.get("abc")); // 1
        System.out.println(map.get("cba")); // 2

        String[] input = {"apple", "banana", "apple", "orange", "banana", "apple"};

        Map<String, Integer> mapObj = new HashMap<>();

        for (String item : input) {
            mapObj.put(item, mapObj.getOrDefault(item,0)+1);
        }
        System.out.println(mapObj);

        //Sort the above frequency map by values (descending order of frequency).
        List<Map.Entry<String, Integer>> collect = mapObj.entrySet().stream()
                .sorted((a,b)->b.getValue().compareTo(a.getValue()))
                .toList();
        System.out.println(collect);

        if(collect.size() >= 2){
            System.out.println(collect.get(1).getKey());
        }
        else{
            System.out.println("No second most frequent element");
        }
    }
}
