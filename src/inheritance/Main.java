package inheritance;


class Parent{
    void greet(){
        System.out.println("Hello from parent");
    }
}

class Child extends Parent{
    void greetChild(){
        System.out.println("Hello from Child");
    }
}

public class Main {
    public static void main(String[] args) {
        Child childObj = new Child();
        childObj.greet();
        childObj.greetChild();

        Parent parentObj = new Parent();
        parentObj.greet();
    }
}
