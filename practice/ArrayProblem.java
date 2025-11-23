package practice;

public class ArrayProblem {
    static int check(int[] arr,int sum,int a,int b){
        int f_pos = a;
        int l_pos = b;
        int count=1;
        int n = arr.length-2;
        while (n >= 2){
            if((arr[f_pos]+arr[l_pos])==sum) {
                f_pos++;
                l_pos--;
            } else if ((arr[f_pos]+arr[f_pos+1])==sum) {
                f_pos += 2;
            } else if ((arr[l_pos]+arr[l_pos-1])==sum) {
                l_pos -= 2;
            } else {
                break;
            }
            count++;
            n -=2;
        }
        return count;
    }
    public static int solution(int[] arr){
        int f_pos = 0;
        int l_pos = arr.length-1;
        int finalSum=0,a1 = 0,a2 = 0,a3 = 0;
        if(arr.length > 2){
             a1 = check(arr,arr[f_pos]+arr[l_pos],f_pos+1,l_pos-1);
             a2 = check(arr,arr[f_pos]+arr[f_pos+1],f_pos+2,l_pos);
             a3 = check(arr,arr[l_pos]+arr[l_pos-1],f_pos,l_pos-2);
        }
        if (a1 > a2 && a1 > a3){
            finalSum=a1;
        } else if (a2 > a1 && a2 >a3) {
            finalSum=a2;
        } else {
            finalSum=a3;
        }
        return finalSum;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,3,1,2,2,1,2};
        System.out.println(solution(arr));
    }
}
