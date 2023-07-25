package com.gsm;

import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        // 큐 생성
        Queue<String> queue = new LinkedList<>();

        // 요소 추가 (offer)
        queue.offer("Element 1");
        queue.offer("Element 2");
        queue.offer("Element 3");

        // 큐의 첫 번째 요소 확인 (peek)
        System.out.println("First element is: " + queue.peek());

        // 요소 제거 (poll)
        System.out.println("Polled element: " + queue.poll());
        System.out.println("Polled element: " + queue.poll());

        // 큐가 비어있는지 확인
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue is not empty");
        }
    }
}
