package practice;

import java.util.Scanner;

// n,m are two integers and sum of int divisible by n and not divisible by n and find difference
public class Problem1 {
    public static int Differenceo(int n,int m){
        int SumDiv=0,SumNot=0;
        for (int i=1;i<=m;i++){
            if(i%n == 0){
                SumDiv=SumDiv+i;
            }else{
                SumNot=SumNot+i;
            }
        }
        return (SumNot-SumDiv);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st range(n) : ");
        int n = sc.nextInt();
        System.out.print("Enter 2nd range(m) : ");
        int m = sc.nextInt();
        int diff = Differenceo(n,m);
        System.out.println(diff);
    }
}
