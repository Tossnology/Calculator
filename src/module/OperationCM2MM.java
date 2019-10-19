package module;

public class OperationCM2MM extends SelfOperation{
    @Override
    public double getResult(){
        if(getNumber()<0){
            return -1;
        }else{
            result = getNumber()*10;
            return result;
        }
    }
}
