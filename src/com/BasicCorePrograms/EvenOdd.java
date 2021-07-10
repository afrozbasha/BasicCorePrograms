package com.BasicCorePrograms;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a Num : ");
        int n = num.nextInt();
        if (n%2 == 0)
            System.out.println(n+" Num is Even");
        else
            System.out.println(n+ " Num is Odd");

    }
}
