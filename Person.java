public class Person {

    // Fields
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Override toString method to display person information
    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a person instance
        Person person = new Person("John Doe", 25);

        // Display person details
        System.out.println(person.toString());
    }
}
