package inheritance;

public class Animal {
    public Animal() {
        System.out.println("Animal Constructor");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public Dog() {
        super();
        System.out.println("Dog Constructor");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog {
    public Puppy() {
        super();

    }

    public void play() {

        super.bark();

        System.out.println("Puppy is playing");
    }

    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.play();
    }
}
