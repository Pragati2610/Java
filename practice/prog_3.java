package practice;

// Calculate CGPA by taking three subject marks as input
public class prog_3 {
    public static void main(String[] args){
        int m1=78, m2=83, m3=94, m4=65, m5=88;
        float percentage = (float) (m1+m2+m3+m4+m5)/5;
        float cgpa = (float) ((float) percentage/9.5);
        System.out.print("Total CGPA obtained : "+cgpa);
    }
}
