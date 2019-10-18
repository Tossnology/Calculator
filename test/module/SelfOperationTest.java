package module;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 一元运算符测试类
 */
public class SelfOperationTest {

    @Test
    public void getNumber() {
        OperationSquare square = new OperationSquare();
        OperationSqrt sqrt = new OperationSqrt();

        square.setNumber(1);
        sqrt.setNumber(0);
        assertEquals(1,square.getNumber(),0);
        assertEquals(0,sqrt.getNumber(),0);
    }

    @Test
    public void setNumber() {
        OperationSquare square = new OperationSquare();
        OperationSqrt sqrt = new OperationSqrt();

        square.setNumber(1);
        sqrt.setNumber(0);
        assertEquals(1,square.getNumber(),0);
        assertEquals(0,sqrt.getNumber(),0);
    }

    @Test
    public void getResult() {
        OperationSquare square = new OperationSquare();
        OperationSqrt sqrt = new OperationSqrt();

        square.setNumber(1.5);
        sqrt.setNumber(9);
        assertEquals(2.25,square.getResult(),0);
        assertEquals(3,sqrt.getResult(),0);
    }
}