// Develop a program for an organization that manages different types of employees. There are
// general employees, managers, and interns. Each type of employee has different ways of
// calculating bonuses and benefits.
// • Abstract Class: Employee, Fields: name, id, baseSalary
// Constructor: Initializes all fields.
// Abstract methods: double calculateBonus(), String getDetails()
// • Subclass: Manager
// Field: department, Bonus: 20% of base salary
// Overrides getDetails()
// • Subclass: Intern
// Field: university, Bonus: Fixed: $500
// Overrides getDetails()
// • Subclass: Developer
// Field: level (Junior, Mid, Senior), Bonus: Junior (10%), Mid (15%), Senior
// (25%) of base salary
// Overrides getDetails()
// • Interface: Taxable
// Method: double calculateTax()
// • All employees are taxable: Tax is 10% of baseSalary + 5% of bonus
// • Main class: Company
// ➢ Print details of each employee. Display total salary, bonuses and taxes.

public class q2 {
    public static void main(String[] args) {
        Managers m1 = new Managers("Lohith", "A123", 100000, "CS");
        Intern I1 = new Intern("Brook", "B123", 10000, "VTU");
        Developer D1 = new Developer("Luffy", "C123", 250000, "Mid");

        Employee x;
        x = m1;
        x.getDetails();
        System.out.println("Total Salary : " + (x.calculateBonus() + x.baseSalary));
        System.out.println("tax : " + x.calculateTax());

        x = I1;
        x.getDetails();
        System.out.println("Total Salary : " + (x.calculateBonus() + x.baseSalary));
        System.out.println("tax : " + x.calculateTax());

        x = D1;
        x.getDetails();
        System.out.println("Total Salary : " + (x.calculateBonus() + x.baseSalary));
        System.out.println("tax : " + x.calculateTax());
    }
}

abstract class Employee implements taxable {
    String name;
    String id;
    double baseSalary;

    Employee(String name, String id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public double calculateTax() {
        return (0.10 * baseSalary) + (0.05 * calculateBonus());
    }

    abstract double calculateBonus();

    abstract void getDetails();

}

class Managers extends Employee {
    String department;

    Managers(String name, String id, double baseSalary, String department) {
        super(name, id, baseSalary);
        this.department = department;
    }

    double calculateBonus() {
        double bonus = (0.2 * baseSalary);
        return bonus;
    }

    void getDetails() {
        System.out.println("Name : " + name);
        System.out.println("Designation : Manager");
        System.out.println("Department : " + this.department);

    }

}

class Intern extends Employee {
    String university;

    Intern(String name, String id, double baseSalary, String university) {
        super(name, id, baseSalary);
        this.university = university;
    }

    double calculateBonus() {
        double bonus = 500;
        return bonus;
    }

    void getDetails() {
        System.out.println("Name : " + name);
        System.out.println("Designation : Intern");
        System.out.println("university : " + this.university);

    }

}

class Developer extends Employee {
    String level;

    Developer(String name, String id, double baseSalary, String level) {
        super(name, id, baseSalary);
        this.level = level;
    }

    double calculateBonus() {
        if (level == "junior") {
            return (0.1 * baseSalary);
        } else if (level == "Mid") {
            return (0.15 * baseSalary);
        } else if (level == "Senior") {
            return (0.25 * baseSalary);
        } else {
            return 0;
        }
    }

    void getDetails() {
        System.out.println("Name : " + name);
        System.out.println("Designation : Developer");
        System.out.println("level : " + this.level);

    }

}

interface taxable {
    double calculateTax();

}
