package com.company;

import java.util.ArrayList;

/**
 * Created by patrick on 3/18/17.
 */
public class ArrayListTest
{
    public static void main(String[] args)
    {
        ArrayList<Employee> staff = new ArrayList<Employee>();

        staff.add(new Employee("Test 1", 100, 1, 1, 1));
        staff.add(new Employee("Test 2", 100.2, 1991, 2, 2));
        staff.add(new Employee("Test 3", 10000, 1, 1, 2));

        for (Employee e : staff)
        {
            System.out.println(e.getName() + ", " + e.getSalary() + ", " + e.getId());
        }
    }
}
