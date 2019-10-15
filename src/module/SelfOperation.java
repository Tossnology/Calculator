package module;

/**
 * 自我运算，仅包括平方开方
 */
public abstract class SelfOperation {
    private double number;
    protected double result;

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public abstract double getResult();


}
