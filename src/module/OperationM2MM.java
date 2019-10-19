package module;

public class OperationM2MM extends SelfOperation{
    @Override
    public double getResult(){
        if(getNumber()<0){
            return -1;
        }else{
            result = getNumber()*1000;
            return result;
        }
    }
}
