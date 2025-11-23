package Acc_que;
public class Prog_17 {
    public static String rev(String str){
        String strr="";
        for (int i=0;i<str.length();i++){
//            str.charAt(i);
            strr=str.charAt(i)+strr;
        }
        return strr;
    }
    public static void main(String[] args) {
        String str1="Pragati";
        String str2="Mishra";
        String ans= str1+str2;
        System.out.println(rev(ans));
    }


}
