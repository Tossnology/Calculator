package module;

public class OperationM2KM extends SelfOperation{
    @Override
    public double getResult(){
        result = getNumber()/1000;
        return result;
    }
}
