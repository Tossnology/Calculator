package module;

class OperationSub extends BasicOperation{
    @Override
    public double getResult(){
        double result = 0;
        result = getNumberA()-getNumberB();
        return  result;
    }
}