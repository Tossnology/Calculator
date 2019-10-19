package module;

public class OperationMM2KM extends SelfOperation{
    @Override
    public double getResult(){
        result = getNumber()/1000000;
        return result;
    }
}
