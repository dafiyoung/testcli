package com.company.AbstractClasses;

/**
 * Created by patrick on 3/18/17.
 */
public abstract class Person
{
    private String name;

    public abstract String getDescription();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
