package Accenture;

public class ProgramSix {

    public static int numberOfCarry(int num1,int num2){
        String strNum1 = String.valueOf(num1);
        String strNum2 = String.valueOf(num2);
        int carry = 0;
        int carryCount = 0;
        int carrySum = 0;
        int i = strNum1.length() - 1;
        int j = strNum2.length() - 1;
        while (i >= 0 || j >= 0) {
            int digit1 = (i >= 0) ? Character.getNumericValue(strNum1.charAt(i)) : 0;
            int digit2 = (j >= 0) ? Character.getNumericValue(strNum2.charAt(j)) : 0;
            int total = digit1 + digit2 + carry;
            if (total >= 10) {
                carry = total-9;
                carrySum += (total-9);
                carryCount++;
            } else {
                carry = 0;
            }
            i--;
            j--;
        }
        System.out.println(carrySum);
        return carryCount;

    }

    public static void main(String[] args) {
        int num1 = 451;
        int num2 = 349;
        System.out.println(numberOfCarry(num1,num2));
    }
}

/*
When the sum of the digits exceeds a total of 9, a carry digit is added to the right-left of the digit. Execute the function: Int Numberofcarry(Integer num 1, Integer num 2)

Assumption

num1, num2 > = 0

Example

Input:
num1: 451
num2: 349

Output:
2

Explanation

When we add these two numbers from the right to the left, we get two carries. The value of each of the carries is 1. Hence, the output is the total of these two carries, i.e., 2.

Sample input:
num1: 23
num2: 563

Sample output:
0
 */