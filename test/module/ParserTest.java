package module;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void calculate() {
        Parser p = new Parser();
        assertEquals(3.0, p.calculateInOrder("1+2"), 0);
        assertEquals(13.0, p.calculateInOrder("11+2"), 0);
        assertEquals(23.0, p.calculateInOrder("11+12"), 0);
        assertEquals(11.0, p.calculateInOrder("1+5×2"), 0);
        assertEquals(11, p.calculateInOrder("1+(5×2)"), 0);
        assertEquals(7.0, p.calculateInOrder("(5+2)"), 0);
    }

    @Test
    public void infix2suffix() {
        List<String> suf1 = Arrays.asList("1","2","3","×","+","4","5","+","6","×","+");
        assertEquals(suf1, new Parser().infix2suffix("1+2×3+(4+5)×6"));

        List<String> suf2 = Arrays.asList("1","2","3","×","+","4","5","×","6","+","7","×","+");
        assertEquals(suf2, new Parser().infix2suffix("1+2×3+(4×5+6)×7"));
    }

    @Test
     public void compareOperation() {
        Parser p = new Parser();
        assertEquals(1, p.compareOperation('×','+'));
        assertEquals(0, p.compareOperation('×','×'));
        assertEquals(-1, p.compareOperation('+','×'));
        assertEquals(0, p.compareOperation('+','+'));
        assertEquals(1, p.compareOperation('^','+'));
        assertEquals(0, p.compareOperation('^','×'));
        assertEquals(-1, p.compareOperation('+','^'));
    }

    @Test
    public void binaryCalculate() {
        Parser p = new Parser();
        assertEquals(1.5, p.binaryCalculate("1","0.5",ButtonMapper.ADD_BTN), 0);
        assertEquals(0.5, p.binaryCalculate("1","0.5",ButtonMapper.MINUS_BTN), 0);
        assertEquals(0.5, p.binaryCalculate("1","0.5",ButtonMapper.MULTIPLY_BTN), 0);
        assertEquals(2.0, p.binaryCalculate("1","0.5",ButtonMapper.DIVISION_BTN), 0);
    }

    @Test
    public void singleCalculate() {
        Parser p = new Parser();
        assertEquals(3.0, p.singleCalculate("9", ButtonMapper.ROOT_BTN), 0);
        assertEquals(9, p.singleCalculate("3", ButtonMapper.SQUARE_BTN), 0);
        assertEquals(0.125, p.singleCalculate("8", ButtonMapper.FRACTION_BTN), 0);
    }
}