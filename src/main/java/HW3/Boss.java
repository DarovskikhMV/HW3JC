package HW3;

public class Boss extends Employee {

        public Boss(String name, String position, double salary, int year, int month, int day) {
            super(name, position, salary, year, month, day);
        }
        public static void increaseSalary(Employee[] employees, double amount) {
            for (Employee employee : employees) {
                if (!(employee instanceof Boss)) {
                    employee.salary += amount;
                }
            }
        }
    }
