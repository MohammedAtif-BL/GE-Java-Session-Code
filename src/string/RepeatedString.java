package string;

import java.util.*;

public class RepeatedString {
    public static void main(String[] args) {
        String[] str = {"bbb","ccc","bbb","aaa","aaa"};
        Map<String, Integer> map = new TreeMap<>();
        for (String item: str){
            map.put(item, map.getOrDefault(item,0)+1);
        }
        System.out.println(map);

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int value : map.values()) {
            if (value > max) {
                secondMax = max;
                max = value;
            } else if (value > secondMax && value != max) {
                secondMax = value;
            }
        }
        if(secondMax == Integer.MIN_VALUE){
            System.out.println("No second max");
        }else{
            System.out.println(secondMax);
        }

        // Step 3: Find all strings with second max frequency
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == secondMax) {
                result.add(entry.getKey());
            }
        }

        System.out.println("Second most frequent frequency: " + secondMax);
        System.out.println("Strings with that frequency: " + result);



    }
}
