package Acc_que;
public class Prog_21 {
    public static int diff(String str1) {
        int count1 = 0, count2 = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ' ')
                count1++;
        }
        return count1;
    }

        public static void evenodd(int n)
        {
            if(n%2==0)
                System.out.println("even" +n);
            else System.out.println("odd" +n);
        }



    public static void main(String[] args) {
        String s="hello wor ld";
        String t = "he ll ow or ld";
        int c= diff(s);
        int d = diff(t);
        int res=Math.abs(c-d);
        evenodd(res);


    }
}
