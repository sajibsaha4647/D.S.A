package com.sajib;

public class array_2d {
    public static void main(String[] args) {

        int [][] number = new int[2][3] ; //here 2 row and 3 collumn


        number[0][0] = 10 ;
        number[0][1] = 20 ;
        number[0][2] = 20 ;
        number[1][0] = 40 ;
        number[1][1] = 80 ;
        number[1][2] = 90 ;

        System.out.println(number.length);
        System.out.println(number.toString());

    }
}
