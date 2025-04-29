package Generics;

public class SimpleAdd {
    public int addInt(int num1,int num2){
        return num1+num2;
    }

    public String addString(String str1, String str2){
        return str1+str2;
    }

    public static void main(String[] args) {
        SimpleAdd obj = new SimpleAdd();

        System.out.println("Sum: " +obj.addInt(10,20));
        System.out.println("Concat: " + obj.addString("Hello","World"));
    }
}


