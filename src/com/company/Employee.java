package com.company;
import java.time.*;

/**
 * Created by patrick on 3/17/17.
 */


public class Employee
{
    // fields
    private String name;
    private double salary;
    private LocalDate hireDay;
    private static int nextId=1;
    private int id;

    // constructor
    public Employee( String n, double s, int yy, int mm, int dd)
    {
        name = n;
        salary = s;
        hireDay = LocalDate.of(yy,mm,dd);
        this.id = nextId;
        nextId++;
    }

    //methods
    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    public void raiseSalary(double t)
    {
        salary = salary*(1+t/100);
    }

    public int getId()
    {
        return id;
    }

    public static int getNextId()
    {
        return nextId;
    }

    public void setId()
    {
        id = nextId;
        nextId++;
    }

    public static void main(String[] args)
    {
        Employee emp = new Employee("Test", 2000, 1991,1,1);
        System.out.println(emp.getName()+" "+emp.getSalary()+" "+emp.getHireDay()+" "+Employee.getNextId());
        emp.setId();
        System.out.println(Employee.getNextId()+" "+emp.getNextId());
    }

}