package com.company.ConstructorTest;

/**
 * Created by patrick on 3/17/17.
 */
public class ConstructorTest
{
    public static void main(String[] args)
    {

        Manager boss = new Manager("Test Manager", 2000000, 1991, 1, 1);
        boss.setBonus(10004);
        System.out.print(boss.getSalary()+"Name "+boss.getName());


        Employee[] staff = new Employee[4];
        staff[0] = new Employee("test", 40000,1,1,1);
        staff[1] = new Employee("test1", 1.1);
        staff[2] = new Employee();
        staff[3] = boss;

        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + " id=" + e.getId() + " salary=" + e.getSalary());
        }



    }


}
