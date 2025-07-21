// Problem Type: Pattern Printing  
// Question Link: https://www.naukri.com/code360/problems/reverse-star-triangle_6573685?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems  
// Approach: Use outer loop from 1 to n; print spaces (i - 1) and stars (2*(n - i) + 1) in each row to form an inverted centered triangle.


public class Solution {
    public static void nStarTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*n-(2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}