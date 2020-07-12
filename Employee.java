package employee;

class PermanentEmployee extends Employee {
    private double salary;

    PermanentEmployee(String name, String surname, double employeeNumber, double salary) {
        super(name, surname, employeeNumber);
        this.salary = salary;
    }

    @Override
    public double earnings() {
        // I had no clue how else to do this XD
        return this.salary;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    PartTimeEmployee(String name, String surname, double employeeNumber, int hoursWorked) {
        super(name, surname, employeeNumber);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double earnings() {
        // I am pretty sure my math is correct...
        if (this.hoursWorked <= 40) {
            return this.hoursWorked * 300;
        } else if(this.hoursWorked > 40) {
            return ((300 * 40) + ((this.hoursWorked - 40) * 600));
        }

        return 0;
    }
}

public abstract class Employee {
    private String name;
    private String surname;
    public double employeeNumber;

    Employee(String name, String surname, double employeeNumber) {
        this.name = name;
        this.surname = surname;
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getEmployeeNumber() {
        return employeeNumber;
    }

    public abstract double earnings();

    public static void main(String[] args) {
        // Create the objects.
        Employee employee1 = new PermanentEmployee("Thando", "Nkosi", 7824, 15500.00);
        Employee employee2 = new PermanentEmployee("Kabelo", "Mogau", 7825, 14500.00);
        Employee employee3 = new PartTimeEmployee("Kobus", "Pretorius", 7826, 38);
        Employee employee4 = new PartTimeEmployee("Xolisa", "Mxutu", 7827, 50);

        System.out.println("Name \t Surname \t Employee Number \t Salary");
        System.out.println(
                employee1.getName() + "\t" +
                        employee1.getSurname() + "\t\t" +
                        employee1.getEmployeeNumber() + "\t\t\t\t" +
                        employee1.earnings()
        );
        System.out.println(
                employee2.getName() + "\t" +
                        employee2.getSurname() + "\t\t" +
                        employee2.getEmployeeNumber() + "\t\t\t\t" +
                        employee2.earnings()
        );
        System.out.println(
                employee3.getName() + "\t" +
                        employee3.getSurname() + "\t" +
                        employee3.getEmployeeNumber() + "\t\t\t\t" +
                        employee3.earnings()
        );
        System.out.println(
                employee4.getName() + "\t" +
                        employee4.getSurname() + "\t\t" +
                        employee4.getEmployeeNumber() + "\t\t\t\t" +
                        employee4.earnings()
        );
    }
}