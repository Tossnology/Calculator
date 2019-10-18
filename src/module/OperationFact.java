package module;

public class OperationFact extends SelfOperation {
    @Override
    public double getResult(){
        if(getNumber()/(int)getNumber()!=1){
            return -1;
        }else{
            result = 1;
            for(int i = (int)getNumber();i>=1;i--){
                result *= i;
            }
            return result;
        }
    }
}
