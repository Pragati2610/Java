public class InsertionSort {

    public static void  sorting(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j-=1;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args){
        int arr[] = {5,3,4,2,1};
        Helper helper = new Helper();
        helper.printArray(arr);
        sorting(arr);
        System.out.println("Sorted array is : ");
        helper.printArray(arr);
    }
}
