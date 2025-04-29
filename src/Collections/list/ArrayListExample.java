package Collections.list;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> obj = new ArrayList();

        System.out.println("Size of List:" +obj.size());

        //add elements
        obj.add("Apple"); // -index 0
        obj.add("Cherry"); // -index 1
        obj.add("Cherry"); // -index 2
        obj.add("Banana"); // -index 3


        System.out.println("Elements of List:"+obj);
        //check size
        System.out.println("Size of List:" +obj.size());

        //access elements
        System.out.println(obj.get(0));

        //Modify element
        obj.set(6,"Mango");
        System.out.println("Updated List: "+obj);

        //Remove element
        obj.remove(1);
        System.out.println("After removal: "+obj);

        //Check if contains
        System.out.println("Check List Contains Banana: "+obj.contains("Banan"));

        //Iterate Using for-each
        System.out.println("Fruits: ");

            for(String fruit: obj){
                System.out.print(fruit+" ");
            }


        System.out.println();
        //Iterate using Iterator
        Iterator<String> iterator = obj.iterator();

        while(iterator.hasNext()){
            String fruit = iterator.next();
            System.out.print(fruit+" ");
        }
    }
}
