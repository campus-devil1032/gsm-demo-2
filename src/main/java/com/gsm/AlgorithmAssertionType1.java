package com.gsm;

public class AlgorithmAssertionType1 {

    public static int addNumbers(int a, int b) {
        int sum = a + b;
        // 현업에선 여러가지 이유로 assert를 사용하지 않는다. (성능저하, 불필요한 예외처리 발생 등)
        // JVM에 -enableassertions 을 사용하지 않으면 `assert` 문은 작동하지 않는다.
        // Assertion을 사용하여 덧셈 결과가 10보다 작거나 같은지 확인
        assert sum <= 10 : "덧셈 결과가 10보다 큽니다.";
        return sum;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        int result = addNumbers(num1, num2);
        System.out.println("덧셈 결과: " + result);
    }
}