// Problem Type: Pattern Printing
// Question Link: https://www.naukri.com/code360/problems/n-forest_6570177?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
// Approach: Use nested loops – outer loop for rows (1 to n), inner loop to print '*' n times per row.

public class Solution {
    public static void nForest(int n) {
        for(int i=1; i<=n;i++){
            for(int j=1; j<=n;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}