package module;

public class OperationCM2M extends SelfOperation{
    @Override
    public double getResult(){
        result = getNumber()/100;
        return result;
    }
}
