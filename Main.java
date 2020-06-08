package com.company;

public class Main {
    public static void printHello()
    {
        System.out.println("Hello Welcome To This Program");
    }

    public static int add_or_subtract(String choice, int num)
    {
        if (choice == "add")
        {return num++;}
        else {return num--;}
    }
    public static void main(String[] args) {
	// write your code here
        printHello();
        System.out.println(add_or_subtract("add", 1));
        System.out.println(add_or_subtract("subtract", 1));
    }
}
