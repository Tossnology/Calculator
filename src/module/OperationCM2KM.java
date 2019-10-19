package module;

public class OperationCM2KM extends SelfOperation{
    @Override
    public double getResult(){
        result = getNumber()/100000;
        return result;
    }
}
