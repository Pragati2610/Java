package practice;//import java.util.Scanner;

public class AnargamString {
    public static int Check(String st1){
        int sum1=0;
        for(int i=0;i<st1.length();i++){
            int temp1=st1.charAt(i);
            sum1+=temp1;
        }
        return sum1;
    }
    public static void main(String[] args) {
        String st2, st1;
//        Scanner sc = new Scanner(System.in);
        st1 = "hello";
        st2 = "llohe";
        if ((st1.length() == st2.length())&&(Check(st1) == Check(st2)))
            System.out.println("Strings are anargam.");
        else
            System.out.println("Strings are not anargam.");
    }
}
