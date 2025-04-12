package polymorphism;

public class Calculator {
    int add(int a){
        return a +10;
    }

    double add(double a){
        return a + 10.5;
    }

    void add(int a, double b){
        System.out.println( a + b);
    }

    int add(int a, int b,int c){
        return a + b + c;
    }
}

class Main{
    public static void main(String[] args) {
        Calculator  obj = new Calculator();
        System.out.println(obj.add(10));
        System.out.println(obj.add(20.0));
        obj.add(10,30);
        System.out.println(obj.add(10,20,30));
    }
}
