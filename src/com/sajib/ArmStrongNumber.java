package com.sajib;

import java.util.Scanner;

public class ArmStrongNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0,r,num,temp;
        System.out.println("please enter integer number :");
        num = input.nextInt() ;
        temp = num ;

        while (temp != 0){
            r = temp % 10 ;
            sum = sum + r*r*r ;
            temp = temp/10 ;
        }

        if(num == sum){
            System.out.println(sum);
            System.out.println("Arms strong number");
        }else{
            System.out.println(sum);
            System.out.println("Not Arms strong number");
        }

    }

}
