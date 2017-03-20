package com.company.AbstractClasses;

/**
 * Created by patrick on 3/18/17.
 */
public class PersonTest
{
    public static void main(String[] args)
    {
        Person[] people = new Person[2];

        people[0] = new Employee("Test Employee", 10000, 1991, 1, 1);
        people[1] = new Student("Test Student","CS");

        for (Person p:people)
        {
            System.out.println(p.getName() + ", " + p.getDescription()+"||Test of toString():"+p.toString()+
                    "||Test of printObject:"+p);
        }
    }
}
