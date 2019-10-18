package module;

public class OperationSqrt extends SelfOperation{
    @Override
    public double getResult(){
        return Math.sqrt(getNumber());
    }
}
