package com.sajib;

import java.util.Scanner;

public class finding_sum_and_average {

    public static void main(String[] args) {

        double[] number = new double[5];
        double sum = 0 ;

        System.out.println("please enter 5 number:");

        Scanner input = new Scanner(System.in);

        for (int i= 0 ; i<5;i++){
            number[i] = input.nextDouble();
        }

        for (int i = 0; i<5; i++){
            sum = sum + number[i] ;
        }

        System.out.println("the sun is "+ sum);
        System.out.println("the sun is "+ sum/5);

    }

}
