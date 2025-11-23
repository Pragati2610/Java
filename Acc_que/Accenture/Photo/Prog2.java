package Accenture.Photo;

import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. : ");
        int n = sc.nextInt();
        int arr[]= {1,2,3,4,3,2,1};
        System.out.println(elevation(arr,arr.length));
    }

    public static int trailingZeroes(int n) {
        long r = fact(n);
        System.out.println(fact(n));
        System.out.println(r/10);
        int c=0;
        while(true){
            System.out.println("hi");
            long a= r%10;
            if(a!=0)
                break;
            c++;
            r/=10;
        }
        return c;
    }
    public static long fact(int n){
        if(n<2) return 1;
        return n*fact(n-1);
    }

    public static int elevation(int arr[],int n){
        if(n<2){
            if(arr[0]>arr[1]) return arr[0];
            return arr[1];
        }
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }

}
