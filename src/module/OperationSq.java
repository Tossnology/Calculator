package module;

public class OperationSq extends SelfOperation{
    @Override
    public double getResult(){
        result = getNumber()*getNumber();
        return result;
    }
}
