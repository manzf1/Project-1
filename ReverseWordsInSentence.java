/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reversewordsinsentence;

import java.util.Stack;

public class ReverseWordsInSentence {

    public static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+");
        Stack<String> wordStack = new Stack<>();

        for (String word : words) {
            wordStack.push(word);
        }

        StringBuilder reversedSentence = new StringBuilder();

        while (!wordStack.isEmpty()) {
            reversedSentence.append(wordStack.pop()).append(" ");
        }

        return reversedSentence.toString().trim();
    }

    public static void main(String[] args) {
        String inputSentence = "When Chuck Norris falls in water, Chuck Norris doesn't get wet. Water gets Chuck Norris.";
        String reversedSentence = reverseWords(inputSentence);

        System.out.println("Original Sentence: " + inputSentence);
        System.out.println("Reversed Sentence: " + reversedSentence);
    }
}