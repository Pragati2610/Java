package practice;// [1,2,3,5,4,6]  k=2  [4,6,1,2,3,5]

public class LeetProblem1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k=2;
        while (k > 0 ){
            for(int i=5;i>0;i--){
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
            k--;
        }
        int j=0;
        while(j< arr.length){
            System.out.println(arr[j]);
            j++;
        }
    }
}
