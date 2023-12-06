/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stackspeedtest;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class StackSpeedTest {
    public static void arrayBasedStackSpeedTest() {
        ArrayDeque<Integer> arrayStack = new ArrayDeque<>();
        long startTime = System.currentTimeMillis();

        // Perform millions of push and pop operations
        for (int i = 0; i < 1000000; i++) {
            arrayStack.push(1);
            arrayStack.pop();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Array-based Stack Time: " + (endTime - startTime) + " ms");
    }

    public static void linkedListBasedStackSpeedTest() {
        LinkedList<Integer> linkedListStack = new LinkedList<>();
        long startTime = System.currentTimeMillis();

        // Perform millions of add and remove operations
        for (int i = 0; i < 1000000; i++) {
            linkedListStack.add(1);
            linkedListStack.removeLast();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Linked List-based Stack Time: " + (endTime - startTime) + " ms");
    }

    public static void main(String[] args) {
        arrayBasedStackSpeedTest();
        linkedListBasedStackSpeedTest();
    }
}
