package Jobsheet5;

import java.util.Scanner;
public class PowerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input element number: ");
        int element = sc.nextInt();

        Power[] png = new Power[element];
        for (int i = 0; i < element; i++) {
            System.out.print("Input base number for " + (i+1) + "th element: ");
            int basis = sc.nextInt();
            System.out.print("Input exponent for " + (i+1) + "th element: ");
            int exp = sc.nextInt();
            png[i] = new Power(basis, exp);
        }

        System.out.println("POWER RESULT USING BRUTEFORCE");
        for (Power p : png) {
            System.out.println(p.baseNumber + "^" + p.exponent + ": " + p.powerBF(p.baseNumber, p.exponent));
        }
        System.out.println("POWER RESULT USING DIVIDE AND CONQUER");
        for (Power p : png) {
            System.out.println(p.baseNumber + "^" + p.exponent + ": " + p.powerDC(p.baseNumber, p.exponent));
        }
    }
}
