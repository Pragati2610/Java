package Accenture.Photo;

public class Prog3 {
    public static void main(String[] args) {
        int n = 10;
//        System.out.println(sumOfPrimes(10));
        int arr[] = {10,20,30,40,50,60};
        reverse(arr);
    }

    public static int findFloor(int n){
        while(n>=10){
            if(n%2==0)
                n=(n-2)/2;
            else
                n=n/2;
        }
        return n;
    }

    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static int sumOfPrimes(int n){
        int sum=0,c=0;
        while(c<=n){
            if(isPrime(c)) sum+=c;
            c++;
        }
        return sum;
    }

    public static void printArray(int arr[]){
        for(int i:arr)
            System.out.print(i+" ");
    }

    public static void reverse(int arr[]){
        for(int i=0,j=arr.length-1;i<arr.length/2;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        printArray(arr);
    }
}
