package Acc_que;
public class Prog_22 {
    public static int[] show(int array[]) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > first) {
                second = first;
                first = array[i];

            } else if (array[i] > second && array[i] != first) {
                second = array[i];
            }
        }
        return new int[]{first, second};
    }
    public static void main(String[] args) {
        int arr[] = {1, 7, 4, 2, 3, 9, 5};
        int arr1[] = show(arr);
        System.out.println(arr1[1]);
    }
}
