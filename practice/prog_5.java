package practice;

import java.util.Scanner;

public class prog_5 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers : ");
        float dist = sc.nextFloat();
        int meter = (int) ((float) dist * 1000);
        System.out.print("Total distance in meter : "+meter);
    }
}
