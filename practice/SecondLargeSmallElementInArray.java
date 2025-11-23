package practice;

import java.util.Arrays;

public class SecondLargeSmallElementInArray {
    public static void main(String[] args) {
        int[] num = {0,2,8,5,4,7,9,3,6,1};
        Arrays.sort(num);
        if(num.length != 2){
            System.out.println("Smallest element : "+num[1]);
            System.out.println("Largest element : "+num[num.length-2]);
        }else{
            System.out.println("Smallest & Largest element : -1");
        }

    }
}
