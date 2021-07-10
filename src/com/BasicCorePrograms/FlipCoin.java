package com.BasicCorePrograms;
import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Random random = new Random();
        System.out.print("The number of times to Flip Coin : ");
        int n = num.nextInt();
        int head=0, tail=0;
        for (int i=1; i<=n; i++){
            int r = random.nextInt(2);
            if(r==1){
                tail++;
                System.out.println("Tails");
            }else{
                head++;
                System.out.println("Heads");
            }
        }
        float headPer, tailsPer;
        headPer = (float) head/n * 100;
        tailsPer = (float) tail/n * 100;
        System.out.println("Percentage of Head vs Tails");
        System.out.println("Percentage of Head : "+ headPer);
        System.out.println("Percentage of Tails : "+ tailsPer);


    }
}
