package com.company;

/**
 * Created by patrick on 3/16/17.
 */
public class Welcome
{
    public static void main(String[] args)
    {
        String greeting = "Welcome to Core Java!";
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++)
        {
            System.out.print("=");
        }

        System.out.println();
        System.out.print("");
    }
}
