package practice;

import java.util.Scanner;

public class ReverseANumber {
    public static void Reverse(int num){
        StringBuilder rev = new StringBuilder();
        while(num != 0){
            rev.append(num % 10);
            num/=10;
        }
        System.out.println("Reverse : "+rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        Reverse(num);
    }
}
