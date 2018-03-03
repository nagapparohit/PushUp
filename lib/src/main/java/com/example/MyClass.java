package com.example;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args){

        System.out.println("Hello  Java in android studio.");

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        System.out.println("The value you have entered is :"+x);

        name("Rohit Nagappa");
    }

    private  static  void name(String nameValue){
        System.out.println(nameValue);
    }
}
