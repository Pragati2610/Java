package Accenture.Photo;

public class Prog_9 {
    public  static boolean isVowel(char y){
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u'){
            return true;
        }
        else {
            return false;
        }
    }
    public static int countPermutation(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                continue;
            } else {
                count++;
            }
        }
        return factorial(count);
    }
    public static int factorial(int n){
        if(n==0||n==1)
            return 1;
        return n*factorial(n-1);

    }
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println(countPermutation(str));

    }
}
