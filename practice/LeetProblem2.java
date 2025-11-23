package practice;

// Remove duplicate from array
public class LeetProblem2 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4,4,4,5,6,7};
        int k=0,n=arr.length,m=1;
        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[j]=0;
                    k++;
                }else break;
            }
        }
        int[] arr1 = new int[n];
        for(int i=1;i<n;i++){
            if(arr[i]!=0){
                arr1[m]=arr[i];
                m++;
            }
        }
        for (int j : arr1) {
            System.out.println(j);
        }
        System.out.println("Total unique element : "+(k-1));
    }
}
