package module;

public class OperationMod extends BasicOperation {
    @Override
    public double getResult(){
        result = getNumberA()%getNumberB();
        return result;
    }
}
