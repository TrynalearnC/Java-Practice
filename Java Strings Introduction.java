/*
Given two strings of lowercase English letters, AA and BB, perform the following operations:

Sum the lengths of AA and BB.
Determine if AA is lexicographically larger than BB (i.e.: does BB come before AA in the dictionary?).
Capitalize the first letter in AA and BB and print them on a single line, separated by a space.
Input Format

Two strings, the first being AA and the second being BB. They are comprised of lowercase English letters (no symbols or spaces) and may not be on the same line.

Output Format

There are three lines of output: 
For the first line, sum the lengths of AA and BB. 
For the second line, write Yes if AA is lexicographically larger than BB or No if it is not. 
For the third line, capitalize the first letter in both AA and BB and print them on a single line, separated by a space.

Sample Input

 hello
 java
Sample Output

9
No
Hello Java
Explanation

String AA is "hello" and BB is "java". 
AA has a length of 55, and BB has a length of 44; the sum of their lengths is 99. 
When sorted alphabetically/lexicographically, "hello" comes before "java"; therefore, AA is not larger than BB and the answer is NO. 
When you capitalize the first letter of both AA and BB and then print them separated by a space, you get "Hello Java"  */

- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
// My Code:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String A = input.nextLine();
        String B = input.nextLine();
        System.out.println(A.length() + B.length());
        
        int result = A.compareTo(B);
        if (result < 0) {
            System.out.println("No");
        } 
        else if (result == 0) {
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }    
          
        String A1 = A.substring(0,1).toUpperCase();
        String A2 = A.substring(1);
        System.out.print(A1 + A2 + " ");
               
        String B1 = B.substring(0,1).toUpperCase();
        String B2 = B.substring(1);
        System.out.print(B1 + B2);
              
        //System.out.println(A.toUpperCase() + " " + B.toUpperCase());
        
    }
}
