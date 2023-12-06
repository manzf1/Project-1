/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prefixstack;

import java.util.Stack;

public class PrefixStack {
    private Stack<Integer> items;

    public PrefixStack() {
        this.items = new Stack<>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void push(int item) {
        items.push(item);
    }

    public int pop() {
        if (!isEmpty()) {
            return items.pop();
        }
        return -1; // Or throw an exception indicating stack underflow
    }

    public int peek() {
        if (!isEmpty()) {
            return items.peek();
        }
        return -1; // Or throw an exception indicating stack is empty
    }

    public static void main(String[] args) {
        PrefixStack prefixStack = new PrefixStack();

        // Demonstrate pushing and popping elements
        prefixStack.push(1);
        prefixStack.push(2);
        prefixStack.push(3);

        System.out.println("Peek: " + prefixStack.peek());  // Should print 3
        System.out.println("Pop: " + prefixStack.pop());    // Should print 3

        System.out.println("Is Empty: " + prefixStack.isEmpty());  // Should print false

        prefixStack.push(4);
        prefixStack.push(5);

        System.out.println("Pop: " + prefixStack.pop());    // Should print 5
        System.out.println("Pop: " + prefixStack.pop());    // Should print 4

        System.out.println("Is Empty: " + prefixStack.isEmpty());  // Should print true
    }
}
