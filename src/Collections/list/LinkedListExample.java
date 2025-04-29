package Collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        //Add Element
        linkedList.add("Wake Up");
        linkedList.add("Brush");
        linkedList.add("Exercise");
        linkedList.addFirst("Meditate");
        linkedList.addLast("Break Fast");

        // Print linked List - Full
        System.out.println("Tasks: "+linkedList);

        //remove by position and value
        linkedList.remove(2);
        linkedList.remove("Break Fast");

        System.out.println("After Removal:" + linkedList);

        //Access Element
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        //SIze
        System.out.println("SIze of linked List: "+linkedList.size());

        // Iterate
        for (String list : linkedList){
            System.out.print(list+" ");
        }
    }
}
