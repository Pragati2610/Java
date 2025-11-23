package practice;

import java.util.Scanner;

// find integer in an array
import java.util.Scanner;
public class Prog_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] arr = {2.5f,3.6f,4.7f,5.3f,5.2f};
        float find=sc.nextFloat();
        int flag=0;
        for(float i : arr){
            if (find == i){
                flag=1;
                System.out.println("Element found.");
                break;
            }
        }
        if (flag != 1){
            System.out.println("Element not found.");
        }
    }
}
