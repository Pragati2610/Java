package Accenture;

public class ProgramEight {
    public static int operationBinary(String str){
        if(str==null)
            return -1;
        int res = str.charAt(0)-'0';
        for(int i=1;i<str.length();i+=2){
            if(str.charAt(i)=='A'){
                res = res & (str.charAt(i+1)-'0');
            }else if(str.charAt(i)=='B'){
                res = res | (str.charAt(i+1)-'0');
            }else{
                res = res ^ (str.charAt(i+1)-'0');
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "0C1A1B1C1C1B0A0";
        System.out.println(operationBinary(str));
    }
}


/*
The binary number system only uses two digits 1 and 0.
Perform the function: Int OperationsBinarystring(char* str)

Assumptions

Return to –1 if str is null.
The str is odd.

Example:

Input:
Str: ICOCICIAOBI

Output:
1

Explanation
The input when expanded is “1 XOR 0 XOR 1 XOR 1 XOR 1 AND 0 OR 1”. The result becomes 1 and hence the output is 1.
 */