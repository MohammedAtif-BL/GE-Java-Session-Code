package javapractice;

public class Student {
    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    //copy constructor
    public Student(Student student){
        this.name = student.name;
        this.age = student.age;
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Student1", 25);
        Student student2 = new Student(student1);

        student1.printInfo();
        student2.printInfo();
    }
}
