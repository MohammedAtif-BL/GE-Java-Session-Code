package inheritance;

//class A {
//    void show(){
//        System.out.println("A");
//    }
//}
//
//class B{
//    void show(){
//        System.out.println("B");
//    }
//}
//
//class C extends A,B{
//    public static void main(String[] args) {
//        C c = new C();
//        c.show();
//    }
//}

interface A{
    int number = 10;
    void show();
    default void display(){
        System.out.println("Default Method");
    }

    static void print(){
        System.out.println("Print Method");
    }
}

interface B{
    void show();
}

class C implements A,B{
    public void show(){
        System.out.println("C");
    }

    public static void main(String[] args) {
        C objC= new C();
        objC.show();
        objC.display();
        A.print();
    }
}
