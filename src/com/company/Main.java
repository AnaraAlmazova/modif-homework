package com.company;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int r= scanner.nextInt();

        double area= PI*(r*r);
        System.out.println(area);

        double circumference=PI*2*r;
        System.out.println(circumference);



    }
}



