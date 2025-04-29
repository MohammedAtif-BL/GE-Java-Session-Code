package Generics;

public class SimpleGenericAdder<T> {
    public T add(T a,T b){
       if (a instanceof Integer && b instanceof Integer) {
           Integer sum = (Integer) a + (Integer) b;
           return (T) sum;
       } else {
           String result = a.toString() + b.toString();
           return (T) result;
       }
    }

    public static void main(String[] args) {
        SimpleGenericAdder<Integer> objInt = new SimpleGenericAdder<>();
        int sum = objInt.add(10,30);
        System.out.println("SUm: "+objInt.add(10,20));

        SimpleGenericAdder<String> objString = new SimpleGenericAdder<>();
        System.out.println("String:" +objString.add("Hello","World"));
    }
}
