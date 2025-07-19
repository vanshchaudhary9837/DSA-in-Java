// Problem: Nth Fibonacci Number
// Link: https://www.naukri.com/code360/problems/nth-fibonacci-number_74156
// Approach1: we can use recursion or dynamic programming (tabulation or memoization) to compute the Nth term efficiently
// Approach2: Brute force using recursion — compute F(n) = F(n-1) + F(n-2) with base cases F(0) = 0, F(1) = 1.
// Approach3: we can use an iterative (bottom-up) approach which is much more efficient than brute-force recursion.


import java.util.Scanner;
public class Solution {

	/*
	// 2nd Approach: Using Recursion - Time Complexity = O(2^n), Space Complexity = O(n)
	static int fibonacci(int n){
		// Base cases: If n is equa to 1 or 2, then directly return 1
        if (n == 1 || n == 2)
            return 1;

        // Recursive call for the nth Fibonacci number
        return fibonacci(n - 1) + fibonacci(n - 2);
	}
	*/

	// 3rd Approach: Using Loops - Time Complexity = O(n), Space Complexity = O(1)
	static int fibonacci(int n) {
        // Initialize variables to store the first two Fibonacci numbers
        int a = 0, b = 1;
        
        // Loop from 1 to n to calculate the Fibonacci sequence iteratively
        for (int i = 1; i <= n; i++) {
            // Calculate the next Fibonacci number
            int c = a + b;
            
            // Update a and b to the next pair of Fibonacci numbers
            a = b;
            b = c;
        }
        
        // Return the nth Fibonacci number
        return a;
    }


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fibonacci(n));
	}
}