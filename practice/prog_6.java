package practice;// Stone paper seasor game
import java.util.Scanner;
import java.util.Random;

public class prog_6 {
    public static void SPS(int n){
        int sys_score=0,user_score=0;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<n;i++) {
            System.out.println(" ===================== Round : "+(i+1)+"====================");
            int sys = random.nextInt(1,4);
//            System.out.println("System choice : "+sys);
            System.out.print("  Enter Your Choice : ");
            int user = sc.nextInt();
            if(sys == user){
                System.out.println("Tie Round");
                continue;
            }
            else if((sys==1 && user==2) || (sys == 2 && user == 3) || (sys == 3 && user == 1)){
                System.out.println("you won this round.");
                user_score++;
            }
            else {
                System.out.println("You lost this round.");
                sys_score++;
            }
        }
        if(user_score==sys_score){
            System.out.println("Death round : ");
            SPS(1);
        } else if (user_score > sys_score) {
            System.out.println("=====================  Hurrah! You won the game.  =====================");
        }else{
            System.out.println("=====================  Sorry! You lost.  =====================");
        }
    }
    public static void main(String[] args){
        System.out.println("Rules : \n1.choice should be in between 1, 2 & 3.");
        System.out.println("2.There will be 5 rounds.\n3.Values for game : \n    Stone : 1\n    Paper : 2\n    Scissor : 3\n   ******** Let's Start the game ********\n");
        SPS(5);
    }
}
