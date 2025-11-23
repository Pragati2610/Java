package practice;

import java.util.Scanner;

// Print sum of number acquring by multiplication table of any number
public class Prog_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        int sum=0;
        for (int i=1;i<=10;i++){
            sum += (num*i);
        }
        System.out.println("Sum : "+sum);
    }
}
