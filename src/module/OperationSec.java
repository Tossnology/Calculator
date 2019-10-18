package module;

import static java.lang.Math.sin;

public class OperationSec extends SelfOperation{
    @Override
    public double getResult(){
        result = sin(getNumber());
        return result;
    }
}
