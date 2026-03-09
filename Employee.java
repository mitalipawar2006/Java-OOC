class Employee{
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String f, String l, double salary) {
        firstName = f;
        lastName = l;
        if (salary > 0)
            monthlySalary = salary;
        else
            monthlySalary = 0.0;
    }

    public void setFirstName(String f) {
        firstName = f;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String l) {
        lastName = l;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMonthlySalary(double salary) {
        if (salary > 0)
            monthlySalary = salary;
        else
            monthlySalary = 0.0;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }
}
