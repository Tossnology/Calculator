package module;

public class OperationM2MM extends SelfOperation{
    @Override
    public double getResult(){
        result = getNumber()*1000;
        return result;
    }
}
