package com.example.algorithm.test3;

import java.util.Scanner;

/**
 * 括号匹配
 *
 * @author gzj
 * @date 2020/12/8 9:10
 */
public class BracketStack {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String next = scanner.next();
            System.out.println(next + "的匹配结果：" + isOk(next));
        }
    }

    private static boolean isOk(String next) {

        MyStack<Character> stack = new ArrayStack<>(1);

        char[] chars = next.toCharArray();
        Character top = null;
        for (Character c : chars) {
            switch (c) {
                case('{'):
                    stack.push(c);
                    break;
                case('['):
                    stack.push(c);
                    break;
                case('('):
                    stack.push(c);
                    break;
                case('}'):
                    top = stack.pop();
                    if (top == null) {
                        return false;
                    }
                    else if(top == '{') {
                        break;
                    }
                    else {
                        return false;
                    }
                case(']'):
                    top = stack.pop();
                    if (top == null) {
                        return false;
                    }
                    else if(top == '[') {
                        break;
                    }
                    else {
                        return false;
                    }
                case(')'):
                    top = stack.pop();
                    if (top == null) {
                        return false;
                    }
                    else if(top == '(') {
                        break;
                    }
                    else {
                        return false;
                    }

                default:
                    break;
            }
        }

        return stack.isEmpty();
    }
}
