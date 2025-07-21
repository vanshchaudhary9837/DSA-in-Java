// Problem Type: Pattern Printing
// Question Link: https://www.naukri.com/code360/problems/n-2-forest_6570178?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
// Approach: Print increasing number of '*' per row using nested loops – outer loop for rows (1 to n), inner loop prints i stars in each row.

public class Solution {
    public static void nForest(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}