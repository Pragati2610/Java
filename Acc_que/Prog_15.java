package Acc_que;

public class Prog_15 {
    public static int operations(int H, int v, int vn){
        int ans= H*((v/vn)*(v/vn));
        return ans;
    }
    public static void main(String[] args) {
        int H =16;
        int V=5;
        int Vn=5;
        System.out.println(operations(H,V,Vn));
    }
}
