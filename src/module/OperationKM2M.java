package module;

public class OperationKM2M extends SelfOperation{
    @Override
    public double getResult(){
        result = getNumber()*1000;
        return result;
    }
}
