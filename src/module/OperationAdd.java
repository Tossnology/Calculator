package module;

class OperationAdd extends BasicOperation{
    @Override
    public double getResult(){
        double result = 0;
        result = getNumberA()+getNumberB();
        return  result;
    }
}
