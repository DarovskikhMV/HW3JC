package HW3;

public class Main {
    public static void main(String[] args) {


        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivan", "Junior", 70000, 1992, 12, 18);
        employees[1] = new Employee("Dmitriy", "Junior", 70000, 2010, 4, 13);
        employees[2] = new Employee("Serg", "Junior", 70000, 1994, 9, 5);
        employees[3] = new Employee("Danila", "Middle", 200000, 1970, 9, 12);
        employees[4] = new Boss("Petr", "Senior", 500000, 1975, 11, 31);

        Boss.increaseSalary(employees, 10000);

        for (Employee employee : employees) {
            System.out.println("Имя: " + employee.name + ", Должность: " + employee.position + ", Зарплата: " + employee.salary);
        }

        int result = employees[0].compareDates(employees[1]);
        if (result < 0) {
            System.out.println("Первая дата раньше второй");
        } else if (result > 0) {
            System.out.println("Первая дата позже второй");
        } else {
            System.out.println("Даты равны");
        }
    }
}






