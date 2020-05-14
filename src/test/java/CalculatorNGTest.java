import com.epam.Calculator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;


public class CalculatorNGTest {
    Calculator calculator = new Calculator();

/*    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("Before each");
    }*/

    @Test(priority = 1)
    void testAdd() {
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test(priority = 2, dependsOnMethods = "testMultiply")
    void testSubtract() {
        int result = calculator.subtract(5, 2);
        assertEquals(3, result);
    }

    @Test(priority = 3)
    void testMultiply() {
        int result = calculator.multiply(5, 2);
        assertEquals(10, result);
    }

    @Test(priority = 1)
    void testDivide() {
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }

    @Test(priority = 1)
    void testDivideFail() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }
}
