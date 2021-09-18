/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Isaac Lynch
 */

package exercise13;

import java.util.Scanner;

class Compound
{
    double p;
    double r;
    int y;
    int c;

    public void scn()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Principal: ");
        this.p = sc.nextDouble();

        System.out.print("Rate of Interest: ");
        this.r = sc.nextDouble();

        System.out.print("Number of Years: ");
        this.y = sc.nextInt();

        System.out.print("Times Compounded per Year: ");
        this.c = sc.nextInt();
    }
    public void prt()
    {
        double A = p*Math.pow(1+((r*0.01)/c),c*y);

        System.out.printf(p + " invested at %.1f%% for " + y + " years compounded " + c + " times per year is $%.2f.", r, A);

    }
}
public class solution13 {
    public static void main(String[] args) {

        Compound ca = new Compound();
        ca.scn();
        ca.prt();


    }
}
/* the first thing done is importing the scanner function. after that a class named compund is made which holds
the ints for the years compounded and the times per year they were compounded, the doubles for the rate as well
as the principal, and two public voids titled scn and prt. scn scans in the users inputs, saving them so that
prt can calculate the answer and then print them out. the main function just calls these two voids to perform
the code.
 */