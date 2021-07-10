package com.BasicCorePrograms;
import java.util.Scanner;

public class SwapNum {
    public static void swapNum(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap x : "+ a + " y : "+ b);
    }
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter x and y value : ");
        int x = num.nextInt();
        int y = num.nextInt();
        System.out.println("Before Swap x : "+ x + " y : "+ y);
        swapNum(x, y);

    }
}
