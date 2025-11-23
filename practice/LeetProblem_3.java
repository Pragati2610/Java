package practice;

public class LeetProblem_3 {
    public static void main(String[] args) {
        int[] num={3,0,1};
        int n=num.length,res=0;
        int sum=(n*(n+1))/2;
        for(int j : num){
            res+=j;
        }
        System.out.println((sum-res));
    }
}