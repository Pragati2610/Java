package practice;

// Find maximum number of an array
public class Prog_13 {
    public static void main(String[] args) {
        int[] arr = {5,1,9,2,3,8,0};
        int max = arr[0];
        int min = arr[0];
        for (int i : arr){
            if (i > max){
                max = i;
            }
            if (i < min){
                min = i;
            }
        }
        System.out.println("Maximum : "+max+"\nMinimum : "+min);
    }
}
