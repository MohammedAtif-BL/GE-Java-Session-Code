package Collections.set;

import java.util.*;

public class SetInterfaceExample {
    public static void main(String[] args) {
        Set<String> hashSet = new TreeSet<>();

        //adding elements
        hashSet.add("Orange");
        hashSet.add("Mango");
        hashSet.add("Cherry");
        hashSet.add("Banana");
        hashSet.add("Grapes");
        hashSet.add("Apple");


        System.out.println(hashSet);
        //size
        System.out.println("Size: "+hashSet.size());

        //search
        System.out.println("COntains Apple: " +hashSet.contains("Apple"));

        hashSet.add("Apple");

        System.out.println(hashSet);

        //remove element
        hashSet.remove("Banana");

        //Iterate through the set
        for (String element : hashSet) {
            System.out.println(element);
        }

        //Iterate through the set using iterator
        Iterator<String> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Is set EMpty: "+hashSet.isEmpty());
        //Clear
        hashSet.clear();
        System.out.println("Is set EMpty: "+hashSet.isEmpty());

    }
}
