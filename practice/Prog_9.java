package practice;

import java.util.Scanner;

// Print sum of n even numbers
public class Prog_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter range : ");
        int range = sc.nextInt();
//        Using for loop
        for(int i=1;i<=range;i++){
            if(i%2 == 0){
                sum += i;
            }
        }
        System.out.println("\nSum of even number : "+sum);
//        Using while loop
        int i=0,Sum=0;
        while (i <= range){
            if(i%2 == 0){
                Sum += i;
            }
            i++;
        }
        System.out.println("\nSum of even number : "+Sum);
    }
}
