package Accenture.Photo;

public class Prog1 {
    public static void main(String[] args) {
        int[] arr = {8, 10, 6, 2, 9, 7};
        System.out.println("Q.1 : "+findSuperior(arr));
        System.out.println("Q.2 : "+findMaxCut(5));
        System.out.println("Q.3 : "+findFloor(10));
    }

    /*
    In an array, a superior element is one which is greater than all the elements to its right side. The rightmost element itself be a superior element.
You are given a function, int findSuperior(int arr[]);
The function accepts an integer array and the size of array, Implement the function to find the total number of superior elements present in array.
Assumptions:
N>0 and Array index starts from 0
Input: n= 6
arr= [8,10,6,2,9,7]
Output: 3
     */
    public static int findSuperior(int[] arr) {
        int count = 0, flag = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                count++;
            }
            flag = 0;
        }
        return count;
    }

    /*
It is Edward's birthday today. His friends have bought him a huge circular cake.
Edward wants to find out the maximum number of pieces he can get by making exactly N straight vertical cuts on the cake.
Your task is to write a function that returns the maximum number of pieces that can be obtained by making N number of cuts.
Note: Since the answer can be quite large, modulo it by 1000000007
Input Specification:
input1: An integer N denoting the number of cuts
Anshika Chaudhary
NEW YORK USA
Output Specification:
Return the maximum number of pieces that can be obtained by making N cuts on the cake
     */
    public static int findMaxCut(int n){
        int sum=(n*(n+1))/2;
        sum = sum+1;
        return sum%1000000007;
    }

    /*
    18 Sept 2023(کا
Given a number N your Task is to make N a single digit number by performing these operations
1) If N is odd, make it floor (N/2)
2) If N is even, make it floor((N-2)/2)
3) If N is already a single digit, print as it is
Example:
Input 1: N=25
Output 1: 5
Input 2: N=10
Output: 4
Input 3: N=5
Output: 5
     */
    public static int findFloor(int n){
        while(n>=10){
            if(n%2==0)
                n=(n-2)/2;
            else
                n=n/2;
        }
        return n;
    }
}
