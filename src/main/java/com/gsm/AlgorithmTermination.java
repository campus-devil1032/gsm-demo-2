package com.gsm;

/**
 * 1부터 n까지의 합을 구하는 간단한 알고리즘을 증명해보겠습니다.
 * 이 알고리즘은 반복문을 사용하여 합을 계산하며, 입력으로 주어진 n이 1 이상의 자연수라고 가정합니다.
 */
public class AlgorithmTermination {

    /**
     * 정지성 증명:
     * - 알고리즘의 시작점은 i가 1이고, 종료점은 i가 n + 1일 때입니다.
     * - 알고리즘의 루프는 i를 1씩 증가시키며 계속 반복합니다.
     * - i는 1에서 시작해서 n+1까지 증가하며, 따라서 종료점에서 루프를 종료합니다.
     */
    public static int sumUpToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = sumUpToN(n);
        System.out.println("1부터 " + n + "까지의 합: " + result);
    }
}