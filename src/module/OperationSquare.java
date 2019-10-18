package module;

public class OperationSquare extends SelfOperation {
    @Override
    public double getResult() {
        return Math.pow(getNumber(), 2);
    }

}
