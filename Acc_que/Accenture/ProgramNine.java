package Accenture;

import java.util.Arrays;

public class ProgramNine {
    public static int checkPassword(String str){
        if(str.length()<5 || (str.charAt(0) >= '0' && str.charAt(0) <= '9'))
            return 0;
        int cap=0,num=0;
        for(int i=0;i<str.length();i++){
            if (str.charAt (i) == ' ' || str.charAt (i) == '/')
                return 0;
            if (str.charAt (i) >= 'A' && str.charAt (i) <= 'Z')
                cap++;
            if (str.charAt (i) >= '0' && str.charAt (i) <= '9')
                num++;
        }
        if(cap > 0 && num > 0)
            return 1;
        return 0;
    }

    public static int odd_even(int[] arr){
        int n=arr.length;
        int odd=n/2,even=n/2;
        if(n%2!=0){
            odd = (n/2);
            even = (n/2)+1;
        }
        int[] arrEven = new int[even];
        int[] arrOdd = new int[odd];
        int j=0,k=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                arrEven[j]=arr[i];
                j++;
            }else{
                arrOdd[k]=arr[i];
                k++;
            }
        }
        Arrays.sort(arrEven);
        Arrays.sort(arrOdd);
        for(int i=0;i<arrEven.length;i++){
            System.out.print(arrEven[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arrOdd.length;i++){
            System.out.print(arrOdd[i]+" ");
        }
        System.out.println();
        return 0;
    }
    public static void main(String[] args) {
        String password = "aB4_c5";
        int[] arr = {3,4,1,7,9};
        System.out.println(checkPassword(password));
        System.out.println(odd_even(arr));
    }
}


/*
Perform the function Checkpassword (char str[], int n)
Execute the function which happens to be 1 if the str is a valid password or it remains 0.

Conditions for a valid password:

The password should have at least 4 characters.
It should have at least 1 digit.
It should have one capital letter.
It should not have any spaces or obliques (/).
The first character should not be a number.

Assumption
The input is not empty.

Example

Input:
aA1_67

Output:
1
 */