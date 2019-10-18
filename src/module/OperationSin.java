package module;

import static java.lang.Math.sin;

public class OperationSin extends SelfOperation{
    @Override
    public double getResult(){
        result = sin(getNumber());
        return result;
    }
}
