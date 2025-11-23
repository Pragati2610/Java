package practice;

import java.util.Scanner;

// Check type of website from url
public class prog_8 {
    public static void main(String[] args) {
        String [][] arr = {{".com",".org",".in"},{"Commercial Website","Organization Website","Indian Website"}};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Url : ");
        String url = sc.next();
        for(int i=0;i< arr.length;i++){
            if(arr[0][i].equals(url)){
                System.out.println("Entered Website is "+arr[1][i]);
                break;
            }
        }
    }
}
