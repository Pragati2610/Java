package practice;

import java.util.Scanner;

public class CardProblem {
    public static void BuildCard(int lvl){
        int count=0;
        for(int i=1;i<=lvl;i++){
            if(i==lvl){
                count+=i*2;
            }
            else {
                count+=i*3;
            }
/*            for(int j=0;j<lvl-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=slash;j++){
                if(j%2 != 0){
                    System.out.print("/_");
                    count+=2;
                }else{
                    System.out.print("\\");
                    count++;
                }
            }
            System.out.println();   */
        }
        System.out.println("total card : "+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter level : ");
        int lvl = sc.nextInt();
        BuildCard(lvl);
    }
}
