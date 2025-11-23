package practice;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,5,4,9,7,8};
        int large=arr[0];
        for(int i : arr){
            if(i>=large){
                large=i;
            }
        }
        System.out.println(large);
    }
}
