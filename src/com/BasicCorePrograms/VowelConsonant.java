package com.BasicCorePrograms;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner chr = new Scanner(System.in);
        System.out.print("Enter a Alphabet : ");
        char c = chr.next().charAt(0);
        System.out.println(c);
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                System.out.println("The given Chr is "+ c +" Vowel");
            else
                System.out.println("The given Chr is "+ c +" Const");
        }
    }
}
