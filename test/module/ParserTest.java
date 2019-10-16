package module;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void calculate() {
        Parser p = new Parser();
        p.calculate("1+2");
        p.calculate("11+2");
        p.calculate("11+12");
        p.calculate("1+5×2");
        p.calculate("1+(5×2)");
        p.calculate("(5+2)");
//        a + b*c + (d * e + f) * g
//        a b c * + d e * f  + g * +
        p.calculate("1+2×3+(4×5+6)×7");
//        a+b*c+(d+e)*f
//        abc*+de+f*+
        p.calculate("1+2×3+(4+5)×6");
    }

    @Test
     public void compareOperation() {
        Parser p = new Parser();
        assertEquals(1, p.compareOperation('×','+'));
        assertEquals(0, p.compareOperation('×','×'));
        assertEquals(-1, p.compareOperation('+','×'));
        assertEquals(0, p.compareOperation('+','+'));
    }
}