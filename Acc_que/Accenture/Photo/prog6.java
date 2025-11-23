package Accenture.Photo;

public class prog6 {
    public static void main(String[] args) {
        String str[] = {"puzzle","thunder","powder","blender","under"};
        System.out.println(find("thunder",str, str.length));
    }
    public static int totalCandy(int arr[],int candy,int m){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%5==0){
                count++;
                continue;
            }
            if(arr[i]<m){
                count++;
                m=m-arr[i];
            }
        }
        return count;
    }

    public static String find(String s,String str[],int len){
        int max=0,res=-1;
        for(int i=0;i<len;i++){
            if(match(s,str[i])>max){
                max=match(s,str[i]);
                res=i;
            }
        }
        if(res==-1) return "No Word";
        return str[res];
    }

    public static int match(String s1,String s2){
        if(s1.equals(s2)) return 0;
        int count=0;
        for(int i=s1.length()-1,j=s2.length()-1;j>=0;i--,j--){
            if(s2.charAt(j)==s1.charAt(i)) count++;
            else break;
        }
        return count;
    }

}