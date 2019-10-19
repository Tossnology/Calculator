package module;

public class OperationMM2M extends SelfOperation{
    @Override
    public double getResult(){
        result = getNumber()/1000;
        return result;
    }
}
