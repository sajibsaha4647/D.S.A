package com.sajib;

import java.util.Scanner;

public class getFactorialNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int fact ,number = 1;

        System.out.println("please enter a positive integernumber :");

        fact = input.nextInt();

        for (int i = fact; i>=1; i--){

            System.out.println(i);
            number = number * i;


        }

        System.out.println("here is factorial result of :" + number);

    }

}
