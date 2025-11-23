package practice;

public class RecursionOne {
    static int k=0;
    static int j=1;
    public static void main(String[] args) {
        int[] arr = printNos(5);
        for(int i=0;i<5;i++)
            System.out.println(arr[i]);

    }

    private static int[] printNos(int i) {
//        System.out.println(i);
        int[] arr = new int[i];
        if(i==0) return arr;
        arr[k]=j;
        k++;
        j++;
        printNos(i-1);
        return arr;
    }
}
