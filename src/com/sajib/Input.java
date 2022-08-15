package com.sajib;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number ;
        String name = null;

        System.out.print("Enter any number :");
        number = scanner.nextInt();
        System.out.print("Enter name :");
        name = scanner.next();
        System.out.println("Welcome"+ name );
        System.out.println("Number" +number );

    }






}
