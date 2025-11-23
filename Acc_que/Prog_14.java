package Acc_que;
public class Prog_14 {
    public  static void reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public static int evensum(int []array){
        int sum =0;
        for (int i=0;i<array.length;i+=2){
            sum+=array[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60};
        reverse(arr);
        System.out.println(evensum(arr));
    }
}



