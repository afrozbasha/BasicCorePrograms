package com.BasicCorePrograms;
import java.util.Scanner;
public class MaxThree {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a Three Nums : ");
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();
        System.out.println("a : "+a+" b : "+b+" c : "+c);
        int max = (a>b && a>c) ? a : (b>a && b>c) ? b : c;
        System.out.println("Max Num is : "+max);


    }
}
