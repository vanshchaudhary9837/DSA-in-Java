// Problem: Java If-Else Decision Making
// Link: https://www.geeksforgeeks.org/problems/java-if-else-decision-making0924/0
// Approach: Use simple if-else conditions to compare input values and print appropriate output.


// Approach 01 : Using If-Else - TC = O(1), SC = O(1)

class Solution {
    public static String compareNM(int n, int m) {
        // code here
        // If n is greater than m, return "greater"
        if(n>m){
            return "greater";
        }
        else if(n<m){
            return "lesser";   // If n is less than m, return "lesser"
        }
        else{
            return "equal";    // if both are equal
        }
    }
}


// 2nd Approach: Using Ternary Operator - TC = O(1), SC = O(1)

class Solution {
    public static String compareNM(int n, int m) {
        return (n>m) ? "greater" : (n<m) ? "lesser" : "equal";
    }
}