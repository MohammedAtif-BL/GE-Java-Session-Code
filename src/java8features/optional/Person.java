package java8features.optional;

import java.util.Optional;

public class Person {
    private String name;
    private Optional<String> email;

    public Person(String name, String email) {
        this.name = name;
        this.email = Optional.ofNullable(email);
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return email;
    }
}

class OptionalExample{
    public static void main(String[] args) {
        Person person1 = new Person("ABC", "abc@mail.com");
        Person person2 = new Person("ABC", null);

        printEmail(person1);
        printEmail(person2);
    }

    private static void printEmail(Person person1) {
        System.out.println("Name: " +person1.getName());

        person1.getEmail()
                .ifPresentOrElse(
                        email -> System.out.println("Email: " + email),
                        () -> System.out.println("Email not available")
                );
    }
}
