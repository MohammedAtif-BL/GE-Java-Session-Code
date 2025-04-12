package javapractice;

public class Animal {
    void sound(){
        System.out.println("Animal is making a sound");
    }
}

class Cat extends Animal{
    void sound(){
        super.sound();
        System.out.println("Cat is meowing");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal = new Animal();

        System.out.println(animal instanceof Animal);
        System.out.println(animal instanceof Cat);
        System.out.println(cat instanceof Cat);

    }
}
