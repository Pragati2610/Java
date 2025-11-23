package Accenture;
import java.util.Arrays;

public class ProgramEleven {
        public static int odd_even(int[] arr){
            int n=arr.length;
            int odd=n/2,even=n/2;
            if(n%2!=0){
                odd = (n/2);
                even = (n/2)+1;
            }
            int[] arrEven = new int[even];
            int[] arrOdd = new int[odd];
            int j=0,k=0;
            for(int i=0;i<n;i++){
                if(i%2==0){
                    arrEven[j]=arr[i];
                    j++;
                }else{
                    arrOdd[k]=arr[i];
                    k++;
                }
            }
            Arrays.sort(arrEven);
            Arrays.sort(arrOdd);
            for(int i=0;i<arrEven.length;i++){
                System.out.print(arrEven[i]+" ");
            }
            System.out.println();
            for(int i=0;i<arrOdd.length;i++){
                System.out.print(arrOdd[i]+" ");
            }
            System.out.println();
            return largest(arrEven)+largest(arrOdd);
        }

        public static int largest(int array[]) {
            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;
            for (int i=0;i<array.length;i++) {
                if (array[i] > first) {
                    second = first;
                    first = array[i];
                } else if (array[i] > second && array[i] != first) {
                    second = array[i];
                }
            }
            return second;
        }
        public static void main(String[] args) {
            int array[] = {3,4,1,7,9};
            System.out.println(odd_even(array));
        }

    }
