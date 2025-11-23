package Accenture;

public class ProgramSeven {

    public static String replaceCharacter(String str,char ch1,char ch2){
        StringBuilder s = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch1) {
                s.append(ch2);
            }
            else if(str.charAt(i)==ch2) {
                s.append(ch1);
            }else{
                s.append(str.charAt(i));
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        String str = "apples";
        char ch1 = 'a';
        char ch2 = 'p';
        System.out.println(replaceCharacter(str,ch1,ch2));
    }
}

/*
The given function has a string (str) and two characters, ch1 and ch2. Execute the function in such a way that str returns to its original string, and all the events in ch1 are replaced by ch2, and vice versa.
Replacecharacter(Char str1, Char ch1, Int 1, Char ch2)

Assumption

This string has only alphabets that are in lower case.

Example

Input:
str: apples
ch1: a
ch2: p

Output:
paales

Explanation
All the ‘a’ in the string is replaced with ‘p’. And all the ‘p’s are replaced with ‘a’.
 */