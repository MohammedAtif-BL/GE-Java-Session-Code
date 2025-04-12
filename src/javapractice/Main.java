package javapractice;

class Car{

    String color; //instance variable
    int count; //static variable
    double doubleCount;
    char ch;
    static int number;


    //Default constructor
    Car(){

    }

    //Parameterized constructor
    Car(String color){
        this.color = color;
    }

    // Syntax for method declaration
//    access_modifers return_type methodName(Method parameter){
//        //method body
//    }
    public void drive(){
        System.out.println("Car is driving");
        int number=0; // local variable
        System.out.println("Number: "+number);
    }

}

public class Main {
    int number =10 ; // instance variable
    public static void main(String[] args) {
        Car carObj = new Car();
        Car carObj2 = new Car("Black");
//        carObj.color = "Red";
        carObj.drive();
        Car.number =100;
        System.out.println("Default Value for Int:" +carObj.count);
        System.out.println("Default Value for String: "+carObj.color);
        System.out.println("Default Value for Double: "+carObj.doubleCount);
        System.out.println("Default Value for Char: "+carObj.ch);
    }
}
