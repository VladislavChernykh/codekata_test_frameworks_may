import com.epam.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("Before each");
    }

    @RepeatedTest(10)
    @DisplayName("Add two numbers")
    void testAdd() {
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void testSubtract() {
        int result = calculator.subtract(5, 2);
        assertEquals(3, result);
    }

    @Test
    void testMultiply() {
        int result = calculator.multiply(5, 2);
        assertEquals(10, result);
    }

    @Test
    @EnabledOnOs(OS.WINDOWS) // Run only on Windows platform
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_11) // Run only on JRE 8-11
    @DisplayName("Successful division")
    void testDivide() {
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    @Tag("fail") // Tag tests for grouping
    @DisplayName("Unsuccessful division")
    void testDivideFail() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }
}
