// Problem Type: Pattern Printing  
// Question Link: https://www.naukri.com/code360/problems/rotated-triangle_6573688?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems  
// Approach: Use a single loop to print a right-aligned triangle by printing decreasing spaces followed by increasing stars in each row.


public class Solution {
    public static void nStarTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n-1; i++) {
            for (int j = n-1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}