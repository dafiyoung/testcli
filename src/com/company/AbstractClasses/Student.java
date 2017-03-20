package com.company.AbstractClasses;

/**
 * Created by patrick on 3/18/17.
 */
public class Student extends Person
{
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public String getDescription()
    {
        return "a student majoring in " + major;
    }
}
