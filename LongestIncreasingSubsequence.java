/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.longestincreasingsubsequence;

import java.util.Stack;

public class LongestIncreasingSubsequence {

    public static int longestIncreasingSubsequence(int[] arr) {
        int n = arr.length;
        int[] lis = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            lis[i] = 1;

            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

        int maxLength = 0;
        int endIndex = 0;

        for (int i = 0; i < n; i++) {
            if (lis[i] > maxLength) {
                maxLength = lis[i];
                endIndex = i;
            }
        }

        // Reconstruct the subsequence using the stack
        stack.push(arr[endIndex]);

        for (int i = endIndex - 1; i >= 0; i--) {
            if (arr[i] < arr[endIndex] && lis[i] == lis[endIndex] - 1) {
                stack.push(arr[i]);
                endIndex = i;
            }
        }

        // Print the longest increasing subsequence
        System.out.print("Longest Increasing Subsequence: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        int length = longestIncreasingSubsequence(arr);
        System.out.println("\nLength of Longest Increasing Subsequence: " + length);
    }
}
