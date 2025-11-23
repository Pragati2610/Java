public class BubbleSort {

    public static void sorting(int[] arr){
        int n = arr.length;
        boolean swapped = false;
        for(int i=0;i<n-1;i++){
            swapped = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    Helper.swap(arr,j+1,j);
                    swapped = true;
                }
            }
            if(swapped == false)
                break;
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
