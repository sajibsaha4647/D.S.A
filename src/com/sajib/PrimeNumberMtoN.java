package com.sajib;

import java.util.Scanner;

public class PrimeNumberMtoN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int m, n;

        System.out.println("enter first number :");
        m = input.nextInt();

        System.out.println("enter second number :");
        n = input.nextInt();

        for (int i = m; i <= n; i++) {
            int count = 0;

            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    count = count + 1;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }

        }

    }
}
