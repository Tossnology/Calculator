package module;

public class OperationKG2G extends SelfOperation {
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