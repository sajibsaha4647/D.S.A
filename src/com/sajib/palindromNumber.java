package com.sajib;

import java.util.Scanner;

public class palindromNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0,r,temp,num;
        System.out.println("enter integer number");
        num = input.nextInt();


        temp = num ;

        while (temp != 0){
            r = temp % 10 ;
            sum = sum *10 +r ;
            temp=temp/10 ;
        }

        if(num == sum){
            System.out.println("this is plindrome number");
        }else{
            System.out.println("not plindrome number");
        }


    }

}
