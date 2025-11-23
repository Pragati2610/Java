package practice;

public class RemoveSpaceFromString {
    public static void main(String[] args) {
        String st = "Ritik and Pragati";
        StringBuilder str = new StringBuilder();
        String s="";
        for(int i=0;i<st.length();i++){
            char c=st.charAt(i);
            if(c!=' '){
                str.append(c);
                s += c;
            }
        }
        System.out.println(s);
        System.out.println(str);
    }
}
