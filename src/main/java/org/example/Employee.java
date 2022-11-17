package org.example;

import org.apache.commons.lang3.StringUtils;

public class Employee {

    private String firstName;
    private String middleName;
    private String lastName;
    private int department;
    private double salary;
    private static int currentId;
    private int id;

    public Employee(String firstName, String middleName, String lastName, int department, double salary) {
        if (!StringUtils.isNumeric(firstName) && StringUtils.isAlpha(firstName)){
            this.firstName = StringUtils.capitalize(firstName);
        } else{
            throw new IllegalArgumentException("Заполните коректно поле FIRST_NAME");
        }

        if (!StringUtils.isNumeric(middleName) && StringUtils.isAlpha(middleName)) {
            this.middleName = StringUtils.capitalize(middleName);
        } else {
            throw new IllegalArgumentException("Заполните коректно поле MIDDLE_NAME");
        }

        if (!StringUtils.isNumeric(lastName) && StringUtils.isAlpha(lastName)) {
            this.lastName = StringUtils.capitalize(lastName);
        } else {
            throw new IllegalArgumentException("Заполните коректно поле LAST_NAME");
        }

        this.department = department;
        this.salary = salary;
        this.id = ++currentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + lastName + " " + firstName + " " + middleName + " / отдел " + department
                + " / зарплата " + salary + " / " + "id " + getId();
    }
}
