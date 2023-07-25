package com.gsm;

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}

public class TreeExample1 {
    public static void main(String[] args) {
        // 루트 노드 생성
        Node root = new Node(1);

        // 노드 추가
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left.left = new Node(6);
        // 트리의 루트 노드 값 출력
        System.out.println("Root node value: " + root.value);
        System.out.println("Root - Right node value: " + root.right.value);
        System.out.println("Root - Left - Left node value: " + root.left.left.value);
    }
}
