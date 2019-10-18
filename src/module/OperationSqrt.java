package module;
import static java.lang.Math.sqrt;

public class OperationSqrt extends SelfOperation{
    @Override
    public double getResult(){
        try {
            result = sqrt(getNumber());
        } catch (Exception e) {
            System.out.println("不能为负数");
            e.printStackTrace();
        }
        return  result;
    }
}
