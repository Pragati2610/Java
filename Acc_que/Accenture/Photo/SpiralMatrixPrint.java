package Accenture.Photo;

public class SpiralMatrixPrint {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},
                    {5,6,7,8},
                {9,10,11,12},{13,14,15,16}};
        spiralPrint(arr);
    }
    public static void spiralPrint(int[][] a)
    {
        int m = a.length,n = a[0].length;
        int top = 0, bottom = m - 1, left = 0,
                right = n - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; ++i) {
                System.out.print(a[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; ++i) {
                System.out.print(a[i][right] + " ");
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; --i) {
                    System.out.print(a[bottom][i] + " ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; --i) {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
        }
    }
}
