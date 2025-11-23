package practice;// Check whether an array is sorted or not
import java.util.Arrays;
public class Prog_14 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,9};
        int num1=arr[0];
        for(int i = 1;i< arr.length; i++){
            if(num1 >= arr[i]){
                System.out.println("Array is not sorted.");
                break;
            }else {
                num1 = arr[i];
            }
        }
        if(num1 == arr[arr.length-1]){
            System.out.println("Array is sorted.");
        }
    }
}
