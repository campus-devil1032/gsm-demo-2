import com.gsm.AlgorithmAssertionType2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlgorithmAssertionType2Test {

    @Test
    public void testAdd() {
        AlgorithmAssertionType2 calculator = new AlgorithmAssertionType2();
        int result = calculator.add(3, 5);

        // JUnit의 Assertions.assertEquals를 사용하여 값이 예상대로인지 확인합니다.
        Assertions.assertEquals(8, result, "Addition 결과가 예상과 다릅니다.");
    }

    @Test
    public void testSubtract() {
        AlgorithmAssertionType2 calculator = new AlgorithmAssertionType2();
        int result = calculator.subtract(10, 3);

        // JUnit의 Assertions.assertEquals를 사용하여 값이 예상대로인지 확인합니다.
        Assertions.assertEquals(7, result, "Subtraction 결과가 예상과 다릅니다.");
    }
}
