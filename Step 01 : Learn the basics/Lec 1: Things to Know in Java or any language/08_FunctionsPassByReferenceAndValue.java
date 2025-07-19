// Problem: Pass by Reference and Value
// Link: https://www.geeksforgeeks.org/problems/pass-by-reference-and-value/1
// Approach: Demonstrate how Java handles parameter passing — primitives by value and objects by reference-like behavior.


lass Solution {
    static int[] passedBy(int a, int b) {
         // a is passed by value — so changes do not reflect outside the function
        a = a + 1;

        // b is assumed to be passed by reference — so simulate by returning the new value
        b = b + 2;

        // Return both values in an array
        return new int[]{a, b};
        
    }
}