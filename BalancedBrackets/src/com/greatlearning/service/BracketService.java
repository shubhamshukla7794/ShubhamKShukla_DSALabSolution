package com.greatlearning.service;

import java.util.Stack;

public class BracketService {


    public boolean isBracketsBalanced(String expr) {

        //Since the brackets must always be in pairs, therefore, the string will always be even
        //to accommodate the opening and closing pairs.
        //So, if length of string is odd that means there is an open bracket somewhere in the string.
        if (expr.length() % 2 != 0 ) {
            return false;
        }

        Stack<Character> bracketsStack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {

            char ch = expr.charAt(i);

            if ( ch == '(' || ch == '{' || ch == '[' ) {
                bracketsStack.push(ch);
                continue;
            }

            if (bracketsStack.isEmpty()) {
                return false;
            }

            char temp;

            switch (ch) {
                case ')' : temp = bracketsStack.pop();
                    if (temp != '(')
                        return false;
                    break;
                case '}' : temp = bracketsStack.pop();
                    if (temp != '{')
                        return false;
                    break;
                case ']' : temp = bracketsStack.pop();
                    if (temp != '[')
                        return false;
                    break;
                default: break;
            }

        }

        return bracketsStack.isEmpty();

    }
}
