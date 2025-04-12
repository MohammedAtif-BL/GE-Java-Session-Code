package polymorphism;

public  class Animal {
     void makeSound(){
         System.out.println("Animal is making a sound");
     }

     void sleep(){
         System.out.println("Animal is sleeping");
     }

}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog is barking");
    }

    void fetch(){
        System.out.println("Dog is fetching");
    }
}

class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cat is meowing");
    }
}

class AnimalMain {
    public static void main(String[] args) {
        Animal animalObj = new Animal();
        animalObj.makeSound();
        animalObj.sleep();

        System.out.println("---------------------");
        Dog dogObj = new Dog();
        dogObj.fetch();
        dogObj.makeSound();
        dogObj.sleep();
        System.out.println("---------------------");

        //Praent Class reference to Child class Object
        Animal polyObj = new Dog();
        polyObj.makeSound();
        polyObj.sleep();
//        polyObj.fetch();

    }
}
