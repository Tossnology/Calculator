package module;

public class OperationCM2M extends SelfOperation{
    @Override
    public double getResult(){
        if(getNumber()<0){
            return -1;
        }else{
            result = getNumber()/100;
            return result;
        }
    }
}
