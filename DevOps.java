// Parent class
class Employee {
    double baseSalary = 30000;

    // Method to display salary
    void salary() {
        System.out.println("Employee base salary: " + baseSalary);
    }
}

// Child class
class DevOps extends Employee {
    double bonus = 10000;

    // Overriding the salary method
    @Override
    void salary() {
        // Call parent class salary using super
        super.salary();
        // Add DevOps specific bonus
        System.out.println("DevOps total salary: " + (baseSalary + bonus));
    }

    public static void main(String[] args) {
        DevOps d = new DevOps();
        d.salary();  // Calls overridden method
    }
}
