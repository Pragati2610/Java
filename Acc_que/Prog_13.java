package Acc_que;
public class Prog_13 {
    public static int sum(int m , int n){
        int a = (n*(n+1))/2;
//        System.out.println(a);
        int ans = n/m;
        int b = (ans*(ans+1))/2;
        int c = m*b;
        return a-(2*c);
    }
    public static void main(String[] args) {
        int m = 6;
        int n =30;
        System.out.println(sum(m,n));
    }
}
