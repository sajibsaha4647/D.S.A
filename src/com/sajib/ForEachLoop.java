package com.sajib;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] names = {12,23,23,23,4,4,56,67} ;


        int sum = 0;

        //try with foreach loop
        for(int x : names){
            sum = sum+x ;
        }
        System.out.println(sum);
    }
}
