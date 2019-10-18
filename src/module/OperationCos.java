package module;

import static java.lang.Math.cos;

public class OperationCos extends SelfOperation{
    @Override
    public double getResult(){
        result = cos(getNumber());
        return result;
    }
}
