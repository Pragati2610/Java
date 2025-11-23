package practice;

import java.util.Scanner;

public class Palindrome {
    public static int PalindromeNum(int num){
        int rev=0;
        while(num != 0){
            rev=(rev*10)+(num % 10);
            num/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int res = PalindromeNum(num);
        if (res ==num)
            System.out.println("Palindrome Number");
        else
            System.out.println("Number is not Palindrome");
    }
}
