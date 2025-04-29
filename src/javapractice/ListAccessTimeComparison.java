package javapractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListAccessTimeComparison {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

//        measuring for array list
            long startArray = System.nanoTime();
            long arrayValue = arrayList.get(5000);
            long endArray = System.nanoTime();
            long arrayTime = endArray - startArray;


        long startLinked = System.nanoTime();
        long linkedValue = linkedList.get(5000);
        long endLinked = System.nanoTime();
        long linkedTime = endArray - startArray;

        System.out.println("Array List Access Time: " + arrayTime + " nanoseconds");
        System.out.println("Linked List Access Time: " + linkedTime + " nanoseconds");

    }
}
