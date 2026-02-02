package Ex3;

public class FullTimeEmployee extends Employee implements BonusEligible {
    double salary;

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    @Override
    double calculateSalary() {
        return salary;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.1;
    }
}