package Accenture.Photo;

import java.util.Arrays;

public class Prog4 {
    public static void main(String[] args) {
        String s = "Hello ritik kumar pandey";
        int[] arr = {1,3,2,2,1};
        System.out.println(candy(arr));
    }

    public static String cutString(String s,int k){
        String str = "";
        int space = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                space++;
            }
            str = str + s.charAt(i);
            if(space==k){
                break;
            }
        }
        return str;
    }

    public static int candy(int[] r) {
        int candy=0;
        int arr[] = new int[r.length];
        Arrays.fill(arr,1);
        if(r[0]>=r[1])
            arr[0]++;
        for(int i=1;i<r.length-1;i++){
            if(r[i]>r[i-1] || r[i]>=r[i+1]){
                arr[i]++;
            }
        }
        if(r[r.length-1]>r[r.length-2])
            arr[arr.length-1]++;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            candy += arr[i];
        }
        return candy;
    }
}
