// Problem Type: Pattern Printing  
// Question Link: https://www.naukri.com/code360/problems/seeding_6581892?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems  
// Approach: Use nested loops – outer loop for rows (n to 1), inner loop prints decreasing number of '*' for each row.

public class Solution {
    public static void seeding(int n) {
        for (int i = 1; i <= n ; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}