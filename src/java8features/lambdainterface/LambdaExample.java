package java8features.lambdainterface;

public class LambdaExample {
    public static void main(String[] args) {
        Calculator add = (a,b) -> a + b;

        Calculator sub = (a,b) -> a - b;

        Calculator divide = (a,b) -> {
            if (b == 0){
                System.out.println("Number cannot be divided by zero");
            return 0;
        }else
                return a/b;
        };

        System.out.println("Addition: " + add.operate(20,30));
        System.out.println("Sub: " + sub.operate(20,30));
        System.out.println("Divide: "+divide.operate(20,10));
    }
}
