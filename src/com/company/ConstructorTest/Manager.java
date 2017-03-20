package com.company.ConstructorTest;

/**
 * Created by patrick on 3/17/17.
 */
public class Manager extends Employee
{
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        return bonus + super.getSalary();
    }

    /**
    public static void main(String[] args) {
        Manager boss = new Manager("Test", 2000000, 1991, 1, 1);
        boss.setBonus(10000);
        System.out.print(boss.getSalary()+"Name "+boss.getName());
    }
     */
}
