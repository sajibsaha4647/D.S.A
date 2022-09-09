package com.sajib;

import java.util.Scanner;

public class multiplicationTable {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        int num,result;

        System.out.println("please enter integer number :");
        num = input.nextInt();

        for(int i = 1; i <= 10; i++ ){
            System.out.println(num + "X" +i +"=" + num*i);
        }


    }

}
