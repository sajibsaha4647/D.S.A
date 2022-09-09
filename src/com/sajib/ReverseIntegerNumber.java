package com.sajib;

import java.util.Scanner;

public class ReverseIntegerNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0, r ,temp ,num;

        System.out.println("enter integer number :");
        num = input.nextInt();

        temp = num ;

        while (temp != 0){
            r = temp % 10 ; //
            sum = sum* 10 +r ;
            temp = temp /10 ;


        }

        System.out.println("result :"+ sum);




    }

}
