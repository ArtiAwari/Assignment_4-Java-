// Parent class
class Person {
    String name;

    // Parameterized constructor
    Person(String name) {
        this.name = name;
        System.out.println("Person constructor called. Name: " + name);
    }
}

// Child class
class CollegeStudent extends Person {
    int rollNo;

    // No-argument constructor
    CollegeStudent() {
        // Call parent parameterized constructor with a value
        super("Arti Awari");  // passing name to parent constructor
        this.rollNo = 101;
        System.out.println("CollegeStudent constructor called. Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        // Creating child object
        CollegeStudent cs = new CollegeStudent();
    }
}
