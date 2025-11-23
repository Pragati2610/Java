package Acc_que;
public class Prog_2 {
    public static String replacecharacters(String str,char ch1, char ch2){
        StringBuilder s = new StringBuilder();
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)==ch1){
                s.append(ch2);
            }
            else if(str.charAt(i)==ch2){
                s.append(ch1);
            }
            else{
                s.append(str.charAt(i));
            }
        }
        return s.toString();
    }
    public static void main(String[] args) {
        String str ="apples";
        char ch1='a';
        char ch2='p';
        System.out.println(replacecharacters(str,ch1,ch2));
    }
}


