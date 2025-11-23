package Acc_que;
public class Prog_10 {
    public static int fibonacci(int n){
        int n1=0,n2=1;
       for(int i=1;i<n;i++){
//           System.out.println(n2);
           int n3=n1+n2;
           n1=n2;
           n2=n3;
       }
       return n2;
    }
    public static void main(String[] args) {
        int n= 9;
        System.out.println(fibonacci(n));
    }
}
