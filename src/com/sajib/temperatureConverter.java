package com.sajib;

import java.util.Scanner;

public class temperatureConverter {

    public static void main(String[] args) {
    //cencious to farenheight

        Scanner input = new Scanner(System.in) ;

        double cencious , fran;
        System.out.println("Enter cencious : ");

        cencious = input.nextDouble();

        fran  =  1.8 * cencious + 32;

        System.out.println("here farenheight : " + fran);



    }

}
