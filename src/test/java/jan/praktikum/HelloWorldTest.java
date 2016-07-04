package jan.praktikum;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Praktikant on 04.07.2016.
 */
public class HelloWorldTest {
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    public void test() {
        assertEquals("1 2 Fizz", fizzBuzz.fizzBuzz());
    }

    @Test
    public void testNumberChange() throws Exception {
        assertEquals("1",fizzBuzz.numberChange(1));
        assertEquals("2",fizzBuzz.numberChange(2));
        assertEquals("Fizz",fizzBuzz.numberChange(3));
        assertEquals("4",fizzBuzz.numberChange(4));
        assertEquals("Buzz",fizzBuzz.numberChange(5));
        assertEquals("FizzBuzz",fizzBuzz.numberChange(15));

    }
}
