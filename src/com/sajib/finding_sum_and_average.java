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
        System.out.println("the avarage is "+ sum/5);

        double max = number[0] ;
        double min = number[0] ;

        for(int i = 0; i<5; i++){
            if(max < number[i]){
                max = number[i] ;
            }
            if(min > number[i]){
                min = number[i] ;
            }
        }

        System.out.println("here max number :" + max);
        System.out.println("here max number :" + min);

    }

}
