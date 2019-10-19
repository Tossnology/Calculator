package module;

public class OperationCM2KM extends SelfOperation{
    @Override
    public double getResult(){
        if(getNumber()<0){
            return -1;
        }else{
            result = getNumber()/100000;
            return result;
        }
    }
}
