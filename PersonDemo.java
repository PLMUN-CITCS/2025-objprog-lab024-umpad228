class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayPersonInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        // Create Person objects
        Person person1 = new Person("Bob", 30);
        Person person2 = new Person();
        
        // Display person details
        person1.displayPersonInfo();
        person2.displayPersonInfo();
    }
}