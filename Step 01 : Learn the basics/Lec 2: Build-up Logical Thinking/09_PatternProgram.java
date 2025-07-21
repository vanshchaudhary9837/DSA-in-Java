// Problem Type: Pattern Printing  
// Question Link: https://www.naukri.com/code360/problems/star-diamond_6573686?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems  
// Approach: Use two loops—first for upper half and second for lower half; in each, print spaces and stars to form a centered diamond pattern.


public class Solution {
    public static void nStarDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
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