package com.sajib;

import java.util.Scanner;

public class numberSeries {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n,sum=0;

        System.out.println("enter numer :");

        n = input.nextInt();

        for (int i = 1; i<n; i++){

            System.out.print(i+ "+");
            sum = sum+i;

        }

        System.out.println(sum);

    }

}
