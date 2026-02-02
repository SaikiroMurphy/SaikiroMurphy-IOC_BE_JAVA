package Ex3;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new FullTimeEmployee(1, "Alice", 60000);
        employees[1] = new PartTimeEmployee(2, "Bob", 20, 120);
        employees[2] = new FullTimeEmployee(3, "Charlie", 80000);

        for (Employee emp : employees) {
            emp.showInfo();
            System.out.println("Salary: $" + emp.calculateSalary());
            if (emp instanceof BonusEligible bonusEmp) {
                System.out.println("Bonus: $" + bonusEmp.calculateBonus());
            }
            System.out.println();
        }
    }
}
