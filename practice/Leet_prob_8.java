package practice;

public class Leet_prob_8 {
    public static int prob1(String s){
        StringBuilder cp= new StringBuilder();
        int index=0;
        if(s.length()==0){
            return 0;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' || s.charAt(i)=='_'){
                index++;
            }
        }
        for(int i=0;i<index+1;i++){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
                return 0;
            }
        }
        for(int i=index+1;i<s.length()+1;i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                cp.append(ch);
            }
            if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
                break;
            }
        }
        int res= Integer.parseInt(cp.toString());
        if(res>=Math.pow(2,-31) && res<=Math.pow(2,31)-1){
            return res;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        String s = "   43";
        System.out.println(prob1(s));
    }
}
