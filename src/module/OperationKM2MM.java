package module;

public class OperationKM2MM extends SelfOperation{
    @Override
    public double getResult(){
        if(getNumber()<0){
            return -1;
        }else{
            result = getNumber()*1000000;
            return result;
        }
    }
}
