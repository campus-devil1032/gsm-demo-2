package com.gsm;

import java.util.Stack;

/**
 *
 *  사용 사례
 *      - 함수 호출은 스택구조이다.
 *      - 문자열 역순 출력. (순차적으로 push 후 pop)
 *      - Undo, Redo (브라우저 뒤로가기 기능, Ctrl+Z 같은)
 */
public class StackExample {
    public static void main(String[] args) {
        // 스택 생성
        Stack<String> stack = new Stack<>();

        // 요소 추가 (push)
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");

        // 스택의 상단 요소 확인 (peek)
        System.out.println("Top element is: " + stack.peek());

        // 요소 제거 (pop)
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // 스택이 비어있는지 확인
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }
}