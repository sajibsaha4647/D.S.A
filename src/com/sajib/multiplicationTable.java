package com.sajib;

import java.util.Scanner;

public class multiplicationTable {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("please enter integer number :");
        num = input.nextInt();

        int fnum ;
        System.out.println("please enter integer again :");
        fnum = input.nextInt();

        for(int i = num; i <= fnum; i++ ){
           for (int j = 1; j<=10; j++){
               System.out.println(i + "X" +j +"=" + i*j);

           }
            System.out.println("============================");
        }


    }

}
