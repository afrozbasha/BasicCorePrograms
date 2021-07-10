package com.BasicCorePrograms;
import java.util.Scanner;
public class ComputeQuotientRemainder {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int dend = num.nextInt();
        System.out.print("Enter divisor: ");
        int dsor = num.nextInt();
        System.out.println("Quotient is : "+ dend / dsor);
        System.out.println("Remainder is : "+ dend % dsor);

    }
}
