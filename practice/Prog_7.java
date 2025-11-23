package practice;

import java.util.Arrays;
import java.util.Scanner;

// To show the day of weeks by taking input from user from 1 to 7
public class Prog_7 {
    public static void main(String[] args) {
        String[] arr = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if (choice == i+1){
                System.out.println("Today is "+arr[i]);
                break;
            }
        }
    }
}
