package practice;

import java.util.Arrays;
// Reverse an array
public class Prog_12 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int temp;
        int n= arr.length;
        for(int i=0;i<n/2;i++){
            temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.print("Reversed array : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
