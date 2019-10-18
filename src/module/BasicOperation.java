package module;

/**
 * 基础操作，仅包括加减乘除。
 */
public abstract class BasicOperation{
    private double numberA = 0;
    private double numberB = 0;
    protected double result = 0;

    public double getNumberA() {
        return numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public abstract double getResult();
}
