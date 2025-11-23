package Accenture.Photo;

public class Prog5 {
    public static void main(String[] args) {
        String str[] = {"File_1", "File_5", "File_3"};
        System.out.println(maxVersion(str));

        String s1 = "101101110";
        String s2 = "111111111100000011";
        System.out.println(decode(s2));

        int num = 1235;
        System.out.println(googlyPrime(num));
    }

    //  googly prime usko bola jata hai jiska digit ka sum prime ho mtlb 1235 number hai to 1+2+3+5=11 to agr 11 prime hai to ye googly prime hai
//    yahi to bola tha krne dekho to easy hai ki nhi sb
    public static String googlyPrime(int num) {
        int prime = 0;
        while (num > 0) {
            prime += (num % 10);
            num /= 10;
        }
        if (prime <= 0) return "NO";
        for (int i = 2; i < prime / 2; i++) {
            if (prime % i == 0) return "NO";
        }
        return "YES";
    }

    //wo video jo kl tmne diya tha coding ka jo 20 august wala uska code hai 1st question ka
//    if do bar use kiya hu dekhna kyu use kiya hu nhi aaye smjh to pakka bolna okay na janta hu thora phasegi bt try krna phle smjhne ka
    public static String decode(String str) {
        int count = -1;
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - '0';
            if (count == -1 && n == 0) continue;
            if (n == 0) {
                res += Character.toString(count + 'A');
                count = -1;
                continue;
            }
            count++;
        }
        if (count != -1) res += Character.toString(count + 'A');
        return res;
    }

    //File check krne ke liye is valid wala code hai aur max version iske through nikal rha hai dekho kaise ho rha hai aur clear krke rakho mn me
    public static int maxVersion(String str[]) {
        int maxVer = 0;
        for (String s : str) {
            int temp = s.charAt(s.length() - 1) - '0';
            if (isValid(s))
                if (temp > maxVer)
                    maxVer = temp;
        }
        return maxVer;
    }

    public static boolean isValid(String str) {
        if (str.length() == 6)
            if (str.substring(0, str.length() - 1).equals("File_"))
                return true;
        return false;
    }
//jaha bhi dikkat ho batana okk na kisi bhi code me ya kisi bhi line me

}