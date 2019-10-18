package module;

import static java.lang.Math.tan;

public class OperationTan extends SelfOperation{
    @Override
    public double getResult(){
        result = tan(getNumber());
        return result;
    }
}
