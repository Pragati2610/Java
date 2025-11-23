package practice;

import java.util.Scanner;

public class PerfectNumber {
    public static void PerfectNum(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i == 0)
                sum+=i;
        }
        if(sum == num)
            System.out.println(num+" is a perfect number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        PerfectNum(num);
    }
}
