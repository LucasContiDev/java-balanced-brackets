package com.kairos.application;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(isBalanced("(){}[]"));
    }

    public static boolean isBalanced(String pValue) {
        boolean result = true;
        char[] value = pValue.toCharArray();
        Stack<Character> stackBrackets = new Stack<Character>();
        
        for (int i = 0; i < value.length; i++) {
            //Verify if the char from "value" is an opening bracket, if yes: push to the stack
            if(value[i] == '[' || value[i] == '(' || value[i] == '{' ) {
                stackBrackets.push(value[i]);
            } 
            //If it's not an opening bracket, then verify the closing bracket type
            else if(value[i] == ']') {
                // If the stack is empty, or the pop element from the stack is the same type, but opening stack, returns false
                if(stackBrackets.isEmpty() || stackBrackets.pop() != '[') {
                    return false;
                }
            }
            //If it's not an opening bracket, then verify the closing bracket type
            else if(value[i] == ')') {
                // If the stack is empty, or the pop element from the stack is the same type, but opening stack, returns false
                if(stackBrackets.isEmpty() || stackBrackets.pop() != '(') {
                    return false;
                }           
            }
            //If it's not an opening bracket, then verify the closing bracket type
            else if(value[i] == '}') {
                // If the stack is empty, or the pop element from the stack is the same type, but opening stack, returns false
                if(stackBrackets.isEmpty() || stackBrackets.pop() != '{') {
                    return false;
                }
            }
        }
        // If the stack is not empty, then is not balanced
        if (!stackBrackets.isEmpty()) {
            result = false;
        }
        return result;
    }
}
