package practice;// Calculate percentage of a student with 5 subjects marks as input
import java.util.Scanner;

public class Prog_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Maths marks : ");
        int cs405 = sc.nextInt();
        System.out.print("Enter Operating System marks : ");
        int cs401 = sc.nextInt();
        System.out.print("Enter Computer Architecture marks : ");
        int cs402 = sc.nextInt();
        System.out.print("Enter Automata marks : ");
        int cs403 = sc.nextInt();
        System.out.print("Enter Algorithms marks : ");
        int cs404 = sc.nextInt();
        float percentage;
        percentage = (float) (cs401 + cs402 + cs403 + cs404 + cs405) /5;
        System.out.print("Total percentage got : "+percentage);
    }
}
