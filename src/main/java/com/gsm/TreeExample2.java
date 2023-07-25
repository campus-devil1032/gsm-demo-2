package com.gsm;

import java.util.TreeSet;

public class TreeExample2 {
    public static void main(String[] args) {
        // TreeSet 생성
        TreeSet<String> treeSet = new TreeSet<>();

        // 요소 추가
        treeSet.add("Element 3");
        treeSet.add("Element 1");
        treeSet.add("Element 2");

        // TreeSet 출력 (요소는 자동으로 정렬됩니다)
        System.out.println("TreeSet: " + treeSet);
    }
}
