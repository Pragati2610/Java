package Acc_que;

public class Prog_18 {
    public static String palindrome(int n){
        int res =0;
        int n1=n;
        while(n>0){
             res = (res*10)+n%10;
            n/=10;
            if(n==n1){
                return "yes";
            }
        }
        return "no";
    }
    public static void main(String[] args) {
        int n=123;
        System.out.println(palindrome(n));
    }

}
