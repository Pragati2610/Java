package practice;// Program to use operators
import java.util.Scanner;

public class Prog_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.printf("Enter 2nd number : ");
        int b = sc.nextInt();
        int c = a + b;
//      We can use ( / , * , - , + , % ) in similar way
        System.out.printf("Sum : "+ c);
    }
}
