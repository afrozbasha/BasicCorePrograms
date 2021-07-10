package com.BasicCorePrograms;

public class PowerOfNum {
    public static void main(String[] args) {
        System.out.println("Takes a command-line argument Num is : "+ args[0]);
        int n = Integer.parseInt(args[0]);
        int pow = 1;
        for (int i=1; i<n && i<31; i++){
            pow = 2 ^ 1;
            System.out.println("2 power of "+ i+"is : "+ pow);
        }
        int year = pow;
        if(year % 400 == 0){
            System.out.println(year+ "is a leap year");
        }else if(year % 100 == 0){
            System.out.println(year+ "is not a leap year");
        }else if(year % 4 == 0){
            System.out.println(year+ "is a leap year");
        }else {
            System.out.println(year+ "is not a leap year");
        }

    }
}
