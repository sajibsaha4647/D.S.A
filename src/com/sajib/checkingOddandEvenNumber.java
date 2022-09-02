package com.sajib;

import java.util.Scanner;

public class checkingOddandEvenNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;

        int number ;
        System.out.println("enter number:");

        number = input.nextInt();

        if(number%2 == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }



    }

}
