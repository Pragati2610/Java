package Accenture;

public class ProgramThree {

    public static String checkAnargam(String input1,String input2){
        if(input1.length()!=input2.length())
            return "No";
        input1 = input1.toLowerCase();
        input2 = input2.toLowerCase();
        int sum1=0,sum2=0;
        for(int i=0;i<input1.length();i++){
            sum1 += input1.charAt(i);
            sum2 += input2.charAt(i);
        }
        if(sum1==sum2)
            return "Yes";
        return "No";
    }

    public static void main(String[] args) {
        String input1 = "Listen";
        String input2 = "Silent";
        System.out.println(checkAnargam(input1,input2));
    }
}

/*
Write a function to validate if the provided two strings are anagrams or not. If the two strings are anagrams, then return ‘yes’. Otherwise, return ‘no’.
Input:

Input 1: 1st string
Input 2: 2nd string

Output:
(If they are anagrams, the function will return ‘yes’. Otherwise, it will return ‘no’.)

Example

Input 1: Listen
Input 2: Silent

Output:
Yes

Explanation

Listen and Silent are anagrams (an anagram is a word formed by rearranging the letters of the other word).
*/
