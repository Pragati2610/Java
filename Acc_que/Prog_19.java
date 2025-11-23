package Acc_que;
public class Prog_19 {
    public static void main(String[] args) {
        int Lcount =0, Ucount=0;
        String str ="Abvchg";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a'&& str.charAt(i)<='z'){
                Lcount++;
            }
            if(str.charAt(i)>='A'&& str.charAt(i)<='Z'){
                Ucount++;
            }
        }
        int diff= Lcount-Ucount;
        int diff1= Math.abs(Ucount-Lcount);
        System.out.println(Lcount + " " + Ucount);
        System.out.println(diff1);
    }
}

