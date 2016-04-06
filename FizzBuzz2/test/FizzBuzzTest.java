import FizzBuzz;
import junit.framework.TestCase;

public class FizzBuzzTest extends TestCase {

    public void testMain() {
        int input = 3;
        String expected = "Fizz";
        String result = FizzBuzz.main(input);
        assertEquals(expected, result);
    }
}