package Acc_que;
public class Prog_16 {
    public static int secondlargest(int array[]) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i ++) {
            if (array[i] > first) {
                second = first;
                first = array[i];
            }
             else if (array[i] > second && array[i] != first) {
                second = array[i];
            }
            }
            return second;
        }
        public static int countoccurance ( int[] arr, int element){
            int count = 0;
            for (int i=0;i< arr.length;i++) {
                if (arr[i] == element) {
                    count++;
                }
            }
            return count;
        }
        public static void main (String[]args){
            int arr[] = {1, 2, 3, 4, 4, 5, 5, 5};
            int n = 8;
            System.out.println(secondlargest(arr));
            System.out.println(countoccurance(arr, secondlargest(arr)));
        }
    }
