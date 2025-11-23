package Acc_que;

public class Prog_12 {
    public static int operations(int N){
     while(N>=10){
         if(N%2==0)
         {
             N= ((N-2)/2);
         }
         else if(N%2!=0){
             N= N/2;
         }
     }
        return N;
    }
    public static void main(String[] args) {
        int n=25;
        System.out.println(operations(n));
    }
}
