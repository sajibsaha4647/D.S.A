package com.sajib;

import java.util.Scanner;

public class triangecalculation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double base,height,area;

        System.out.println("enter base :");

        base = input.nextDouble();
        System.out.println("enter height :");
        height = input.nextDouble();

        area = 0.5 * base * height ;

        System.out.println("area of triange" + area);


    }

}
