package module;

public class OperationKG2G extends SelfOperation {
    @Override
    public double getResult(){
        result = getNumber()*1000;
        return result;
    }
}
