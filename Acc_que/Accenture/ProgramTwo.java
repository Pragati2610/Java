package Accenture;

public class ProgramTwo {

    public static int findLargest(int arr[]){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i=i+2){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }else if(arr[i]>second && arr[i]!=first){
                second=arr[i];
            }
        }
        return second;
    }

    public static int findSmallest(int arr[]){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i=i+2){
            if(arr[i]<first){
                second=first;
                first=arr[i];
            }else if(arr[i]<second && arr[i]!=first){
                second=arr[i];
            }
        }
        return second;
    }

    public static int largeSmallSum(int arr[]){
        if(arr.length<3)
            return 0;
        return findLargest(arr)+findSmallest(arr);
    }

    public static void main(String[] args) {
        int arr[] = {3,2,1,7,5,4};
        System.out.println(largeSmallSum(arr));
    }
}

/*
def LargeSmallSum(arr)

The function takes an integral arr which is of the size or length of its arguments. Return the sum of the second smallest element at odd position ‘arr’ and the second largest element at the even position.

Assumption

Every array element is unique.
Array is 0 indexed.
Note:

If the array is empty, return 0.
If array length is 3 or <3, return 0.

Example

Input:
Arr: 3 2 1 7 5 4

Output:
7


Explanation

The second largest element at the even position is 3.
The second smallest element at the odd position is 4.
The output is 7 (3 + 4).
*/
