class Employee {
    String name, address, jobTitle;
    double salary;

    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    double calculateBonus() {
        return salary * 0.10;
    }

    void performanceReport() {
        System.out.println(name + " is performing well.");
    }

    void manageProject() {
        System.out.println(name + " manages general tasks.");
    }
}

class Manager extends Employee {
    Manager(String n, String a, double s) {
        super(n, a, s, "Manager");
    }

    double calculateBonus() {
        return salary * 0.20;
    }

    void manageProject() {
        System.out.println(name + " manages company projects.");
    }
}

class Developer extends Employee {
    Developer(String n, String a, double s) {
        super(n, a, s, "Developer");
    }

    double calculateBonus() {
        return salary * 0.15;
    }
}

class Programmer extends Employee {
    Programmer(String n, String a, double s) {
        super(n, a, s, "Programmer");
    }

    double calculateBonus() {
        return salary * 0.12;
    }
}

public class Company {
    public static void main(String[] args) {
        Manager m = new Manager("Amit", "Pune", 80000);
        Developer d = new Developer("Riya", "Mumbai", 60000);
        Programmer p = new Programmer("Kunal", "Delhi", 50000);

        System.out.println("Manager Bonus: " + m.calculateBonus());
        System.out.println("Developer Bonus: " + d.calculateBonus());
        System.out.println("Programmer Bonus: " + p.calculateBonus());

        m.manageProject();
    }
}