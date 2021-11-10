package com.kodluyoruz.collections;

import java.util.Stack;

public class MainStack {
    public static void main(String[] args) {
        //LIFO
        Stack<String> stack = new Stack<>();
        stack.push("ali");
        stack.push("ahmet");
        print(stack);

        System.out.println("---");
        String lastElement = stack.pop();
        System.out.println(lastElement);

        System.out.println("---");
        print(stack);

        System.out.println("---");
        stack.push("veli");
        String peek = stack.peek();
        System.out.println("Peek: " + peek);
        print(stack);

        /*
         * The Infix Expression is: 3*(4-2)/3+5
         * The Postfix of the given Infix Expression is: 342-*3/5+
         * 1-) 4-2 = 2 32*3/5+
         * 2-) 2*3 = 6 63/5+
         * 3-) 6/3 = 2 25+
         * 4-) 2+5 = 7
         * result = 7
         */
    }

    public static void print(Stack<?> stack) {
        for (Object o :
                stack) {
            System.out.println(o);
        }
    }
}
