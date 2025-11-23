package Acc_que;
public class Prog_11 {
    public static String convertbinary(int n){
        StringBuilder str = new StringBuilder();
        while(n>0){
           int rem = n%2;
           str.append(rem);
            n/=2;
        }
str.reverse();
       return str.toString();
    }
    public static void main(String[] args) {
        int N = 10;
        System.out.println(convertbinary(N));
    }
}
