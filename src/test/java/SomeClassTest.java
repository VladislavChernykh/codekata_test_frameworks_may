import com.epam.SomeClass;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.jupiter.api.Assertions.*;

public class SomeClassTest {
    @Test
//    @Timeout(value = 1, unit = TimeUnit.MILLISECONDS)
    void testIsPrime() {
        assertAll("Assert isPrime method",
                () -> assertTrue(SomeClass.isPrime(19)),
                () -> assertFalse(SomeClass.isPrime(1))
        );
        assertTimeout(Duration.ofMillis(15), () -> assertFalse(SomeClass.isPrime(Integer.MAX_VALUE)));
    }

    @Test
    void testFibonacciSeq() {
        List<Integer> list = SomeClass.getFibonacciSequence(10);
        MatcherAssert.assertThat(SomeClass.getFibonacciSequence(10), hasItem(8));
    }
}
