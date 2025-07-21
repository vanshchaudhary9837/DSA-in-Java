// Problem Type: Pattern Printing  
// Question Link: https://www.naukri.com/code360/problems/star-triangle_6573671?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems  
// Approach: Use outer loop for rows (1 to n), inner loop to print spaces (n - i) and stars (2*i - 1) for centered triangle shape.


public class Solution {
    public static void nStarTriangle(int n) {
        for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= n-i; j++) {
               System.out.print(" ");
           } 
           for (int j = 1; j <= (2*i - 1); j++) {
               System.out.print("*");
           }
           System.out.println();
        }
    }
}