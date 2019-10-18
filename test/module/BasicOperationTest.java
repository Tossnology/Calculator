package module;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.containsString;

/**
 * 基本运算测试类
 */
public class BasicOperationTest {

    /*
     * Test Strategy:
     *
     *
     */

    @Test
    public void getNumberA() {
        OperationAdd add = new OperationAdd();
        OperationSub sub = new OperationSub();
        OperationMul mul = new OperationMul();
        OperationDiv div = new OperationDiv();

        add.setNumberA(1);
        sub.setNumberA(-1);
        mul.setNumberA(0);
        div.setNumberA(1.5);

        assertEquals(1,add.getNumberA(),0);
        assertEquals(-1,sub.getNumberA(),0);
        assertEquals(0,mul.getNumberA(),0);
        assertEquals(1.5,div.getNumberA(),0);
    }

    @Test
    public void getNumberB() {
        OperationAdd add = new OperationAdd();
        OperationSub sub = new OperationSub();
        OperationMul mul = new OperationMul();
        OperationDiv div = new OperationDiv();

        add.setNumberB(1);
        sub.setNumberB(-1);
        mul.setNumberB(0);
        div.setNumberB(1.5);

        assertEquals(1,add.getNumberB(),0);
        assertEquals(-1,sub.getNumberB(),0);
        assertEquals(0,mul.getNumberB(),0);
        assertEquals(1.5,div.getNumberB(),0);
    }

    @Test
    public void setNumberA() {
        OperationAdd add = new OperationAdd();
        OperationSub sub = new OperationSub();
        OperationMul mul = new OperationMul();
        OperationDiv div = new OperationDiv();

        add.setNumberA(1);
        sub.setNumberA(-1);
        mul.setNumberA(0);
        div.setNumberA(1.5);

        assertEquals(1,add.getNumberA(),0);
        assertEquals(-1,sub.getNumberA(),0);
        assertEquals(0,mul.getNumberA(),0);
        assertEquals(1.5,div.getNumberA(),0);
    }

    @Test
    public void setNumberB() {
        OperationAdd add = new OperationAdd();
        OperationSub sub = new OperationSub();
        OperationMul mul = new OperationMul();
        OperationDiv div = new OperationDiv();

        add.setNumberB(1);
        sub.setNumberB(-1);
        mul.setNumberB(0);
        div.setNumberB(1.5);

        assertEquals(1,add.getNumberB(),0);
        assertEquals(-1,sub.getNumberB(),0);
        assertEquals(0,mul.getNumberB(),0);
        assertEquals(1.5,div.getNumberB(),0);
    }

    @Test
    public void getResult() {
        OperationAdd add = new OperationAdd();
        OperationSub sub = new OperationSub();
        OperationMul mul = new OperationMul();
        OperationDiv div = new OperationDiv();

        add.setNumberA(1);
        sub.setNumberA(-1);
        mul.setNumberA(0);
        div.setNumberA(1.5);

        add.setNumberB(1);
        sub.setNumberB(-1);
        mul.setNumberB(0);
        div.setNumberB(1.5);

        assertEquals(2,add.getResult(),0);
        assertEquals(0,sub.getResult(),0);
        assertEquals(0,mul.getResult(),0);
        assertEquals(1,div.getResult(),0);
    }
}