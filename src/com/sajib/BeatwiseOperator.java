package com.sajib;

public class BeatwiseOperator {

    public static void main(String[] args) {



        int a =10;
        int b = 40;

        int c;

        c = a&b; //and gate

        System.out.println(c);
//
//        c = a|b; //or gate
//
//        System.out.println(c);
//
//        c = a^b; //xor gate
//
//        System.out.println(c);

        c = a>>1; //a ar man k 3 bar vag kora base always of 2

        System.out.println(c);

        c= a<<1;
        System.out.println(c);



    }

}
