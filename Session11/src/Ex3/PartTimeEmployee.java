package Ex3;

public class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

}
