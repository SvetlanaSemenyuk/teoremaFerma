package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();

        if (n > 2) {
            System.out.println("Нет натуральных решений");

        }else
        for (int  c = 1; c<100; c++) {
            for (int a = 1; a < 100; a++)
                for (int b = 1; b < 100; b++)
                    if  (Math.pow(c,n)==Math.pow(a,n)+Math.pow(b,n)) {
                        System.out.println("a^n+b^n= "+Math.pow(c, n));
                    }

        }}}

