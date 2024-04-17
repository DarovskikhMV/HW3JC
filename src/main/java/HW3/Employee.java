package HW3;

import java.time.LocalDate;

public class Employee {

    private final int year;
    private final int month;
    private final int day;
    String name;
    String position;
    double salary;


    public Employee(String name, String position, double salary, int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public int compareDates(Employee otherEmployee) {
        LocalDate thisDate = LocalDate.of(year, month, day);
        LocalDate otherDate = LocalDate.of(otherEmployee.year, otherEmployee.month, otherEmployee.day);
        return thisDate.compareTo(otherDate);
    }
}


