package com.company;

public class PayRoll {
    private String name;
    private String surname;
    private double salary;


    public PayRoll(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalaray() {
        return salary;
    }

    @Override
    public String toString() {
        return "PayRoll{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }


}
