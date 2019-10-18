package module;

import static java.lang.Math.pow;

public class OperationPow extends BasicOperation {
    @Override
    public double getResult(){
        result = pow(getNumberA(),getNumberB());
        return result;
    }
}
