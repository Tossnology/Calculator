package module;

public class OperationKM2MM extends SelfOperation{
    @Override
    public double getResult(){
        result = getNumber()*1000000;
        return result;
    }
}
