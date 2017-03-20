package com.company.AbstractClasses;

import java.time.*;
/**
 * Created by patrick on 3/18/17.
 */
public class Employee extends Person
{
    private double salary;
    private LocalDate hireday;

    public Employee(String name, double salary, int yy, int mm, int dd) {
        super(name);
        this.salary = salary;
        hireday = LocalDate.of(yy,mm,dd);
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireday()
    {
        return hireday;
    }

    public String getDescription(){
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public void raiseSalary(double n)
    {
        salary = salary*(1+n/100);
    }
}
