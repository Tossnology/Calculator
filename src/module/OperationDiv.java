package module;

class OperationDiv extends BasicOperation{
    @Override
    public double getResult(){
        try {
            result = getNumberA() / getNumberB();
        } catch (Exception e) {
            System.out.println("除数不能为0");
            e.printStackTrace();
        }
        return  result;
    }
}
