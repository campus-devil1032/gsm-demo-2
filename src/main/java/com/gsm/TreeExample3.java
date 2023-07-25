package com.gsm;

import java.util.TreeMap;

public class TreeExample3 {
    public static void main(String[] args) {
        // TreeMap 생성
        TreeMap<String, String> treeMap = new TreeMap<>();

        // 요소 추가
        treeMap.put("Key 3", "Value 3");
        treeMap.put("Key 1", "Value 1");
        treeMap.put("Key 2", "Value 2");

        // TreeMap 출력 (키는 자동으로 정렬됩니다)
        System.out.println("TreeMap: " + treeMap);
    }
}
