package module;

public class OperationKM2CM extends SelfOperation{
    @Override
    public double getResult(){
        result = getNumber()*100000;
        return result;
    }
}
