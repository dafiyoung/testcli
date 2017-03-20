package com.company.interfaces;

import java.util.Arrays;

/**
 * Created by patrick on 3/19/17.
 */
public class SortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("test1", 100);
        staff[1] = new Employee("test2 ", 200);
        staff[2] = new Employee("ttttt", 4);

        Arrays.sort(staff);

        for (Employee e : staff) {
            System.out.println("Name: " + e.getName() + " Salary: " + e.getSalary());
        }
    }
}
