// Define a Person class
class Person {
    // Fields (attributes)
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the person's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the Person class
        Person person1 = new Person("John Doe", 25);

        // Display the details of the person
        person1.displayDetails();
    }
}

