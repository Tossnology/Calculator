package module;

public class OperationM2CM extends SelfOperation{
    @Override
    public double getResult(){
        result = getNumber()*100;
        return result;
    }
}
