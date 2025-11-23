package Acc_que;
public class Prog_1 {
    public static int operationBinaryString(String str) {
        if (str == null)
            return -1;
        int a = str.charAt(0) - '0';
        for (int i = 1; i < str.length(); i += 2) {
            if (str.charAt(i) == 'A') {
                a = a & (str.charAt(i + 1) - '0');
            }
            if (str.charAt(i) == 'B') {
                a = a | (str.charAt(i + 1) - '0');
            }
            if (str.charAt(i) == 'C') {
                a = a ^ (str.charAt(i + 1) - '0');
            }
        }
        return a;
    }
    public static void main(String[] args) {
        String str = "1C0C1C1A0B1";
        System.out.println(operationBinaryString(str));
    }
}
