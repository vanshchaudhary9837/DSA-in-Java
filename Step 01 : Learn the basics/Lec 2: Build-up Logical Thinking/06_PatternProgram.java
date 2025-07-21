// Problem Type: Pattern Printing  
// Question Link: https://www.naukri.com/code360/problems/reverse-number-triangle_6581889?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems  
// Approach: Use nested loops – outer loop for rows (1 to n), inner loop prints numbers in reverse from n to current row index.


public class Solution {
    public static void nNumberTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(n-j+1 + " ");
            }
            System.out.println();
        }
    }
}