import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Test
    public void canAddTwoNumbersTogether(){
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2,3));
    }

    @Test
    public void canSubtractTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.subtract(8,3));
    }

    @Test
    public void canMultiplyTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(36, calculator.multiply(6,6));
    }

    @Test
    public void canDivideTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(3.75, calculator.divide(15,4));
    }
}
