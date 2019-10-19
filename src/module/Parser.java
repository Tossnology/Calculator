package module;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 解析器，解析计算式，将输入计算式转换为后缀树表达形式，例如 1 + 3 转化为 1 3 +
 * 同时提供计算功能
 */
public class Parser {

    private Stack<String> stack = new Stack<String>(); //转换计算式所用的栈

    /**
     * 将输入中缀计算式转化为后缀树形式
     * @param equation 中缀计算式
     * @return 后缀树形式计算式
     */
    public List<String> infix2suffix(String equation) {
        List<String> infixList = new ArrayList<String>();
        List<String> suffixList = new ArrayList<String>();
        int len = equation.length();
        StringBuilder sb = new StringBuilder();
        boolean digit = false;
        for (int i = 0; i < len; i++) {
            if (equation.charAt(i) == '(' || equation.charAt(i) == ')') {
                digit = false;
                if (!sb.toString().isEmpty()) {
                    infixList.add(sb.toString());
                }
                sb = new StringBuilder();
                infixList.add(equation.charAt(i) + "");
                continue;
            }
            if ((equation.charAt(i) >= '0' && equation.charAt(i) <= '9')
                    || equation.charAt(i) == '.') {
                if (!digit) {
                    sb.append(equation.charAt(i));
                    digit = true;
                } else {
                    sb.append(equation.charAt(i));
                }
                if (i == len-1) {
                    infixList.add(sb.toString());
                }
                continue;
            }
            digit = false;
            if (!sb.toString().isEmpty()) {
                infixList.add(sb.toString());
            }
            sb = new StringBuilder();
            infixList.add(equation.charAt(i) + "");
        }
        for (String s : infixList) {
            if (s.matches("[0-9]+")) {
                suffixList.add(s);
            }
            if (s.matches("[\\+\\-×÷\\^]")) {
                //如果遇到任何其他的操作符，如（“+”， “*”，“（”）等，从栈中弹出元素直到遇到发现
                // 更低优先级的元素(或者栈为空)为止。弹出完这些元素后，才将遇到的操作符压入到栈中。
                    while (!stack.isEmpty()
                            && (compareOperation(stack.peek().charAt(0), s.charAt(0)) == 1
                            || compareOperation(stack.peek().charAt(0), s.charAt(0)) == 0)) {
                        if (stack.peek().equals("(")) {
                            break;
                        }
                        suffixList.add(stack.pop());
                    }
                stack.push(s);
            }
            //遇到 （ 进行压栈
            if (s.matches("[(]")) {
                stack.push(s);
            }
            // 遇到 ） 将栈中内容弹出
            if (s.matches("[)]")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    suffixList.add(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek().equals("(")) {
                    stack.pop();
                }
            }
        }
        while (!stack.isEmpty()) {
            suffixList.add(stack.pop());
        }
        return suffixList;
    }

    /**
     * 计算输入计算式的值，计算式形式为计算式前后均为数字或括号且计算式格式
     * 正确，无重复运算符或符号。若计算式中没有括号，则按照符号优先级进行计算。
     * @param equation 待计算的计算式
     * @return 计算结果，为浮点形式
     */
    public double calculateInOrder(String equation) {
        List<String> suffixList = infix2suffix(equation);
        stack.clear();
        System.out.println(suffixList);
        for (String s : suffixList) {
            if (s.matches("[0-9]+")) {
                stack.push(s);
            }
            if (s.matches("[\\+\\-×÷\\^]")) {
                String a = stack.pop();
                String b = stack.pop();
                //特殊情况：幂函数出栈顺序需要修改
                if (s.matches("\\^")) {
                    String tmp = a;
                    a = b;
                    b = tmp;

                }
                stack.push(String.valueOf(binaryCalculate(a, b, s)));
            }
        }
        return Double.valueOf(stack.pop());
    }

    /**
     * 二元计算
     * @param a 数字形式字符串
     * @param b 数字形式字符串
     * @param type 运算类型
     * @return 浮点型运算结果
     */
    public double binaryCalculate(String a, String b, String type) {
        switch (type) {
            case "+": {
                return binaryCal(Double.valueOf(a), Double.valueOf(b), new OperationAdd());
            }
            case "-": {
                return binaryCal(Double.valueOf(a), Double.valueOf(b), new OperationSub());
            }
            case "×": {
                return binaryCal(Double.valueOf(a), Double.valueOf(b), new OperationMul());
            }
            case "÷": {
                return binaryCal(Double.valueOf(a), Double.valueOf(b), new OperationDiv());
            }
            case "^": {
                return binaryCal(Double.valueOf(a), Double.valueOf(b), new OperationPow());
            }
        }
        return -1;
    }

    public double singleCalculate(String a, String type) {
        switch (type) {
            case "ROOT": {
                return singleCal(Double.valueOf(a), new OperationSqrt());
            }
            case "SQUARE": {
                return singleCal(Double.valueOf(a), new OperationSquare());
            }
            case "FRACTION": {
                return singleCal(Double.valueOf(a), new OperationFraction());
            }
            case "FACTORIAL": {
                return singleCal(Double.valueOf(a), new OperationFact());
            }
            case "SIN": {
                return singleCal(Double.valueOf(a), new OperationSin());
            }
            case "COS": {
                return singleCal(Double.valueOf(a), new OperationCos());
            }
            case "TAN": {
                return singleCal(Double.valueOf(a), new OperationTan());
            }
            case "EXP": {
                return binaryCal(Math.E, Double.valueOf(a), new OperationPow());
            }
            case "TEN_POW": {
                return binaryCal(10 , Double.valueOf(a), new OperationPow());
            }
        }
        return -1;
    }

    private double binaryCal(double a, double b, BasicOperation op) {
        op.setNumberA(a);
        op.setNumberB(b);
        return op.getResult();
    }

    private double singleCal(double a, SelfOperation op) {
        op.setNumber(a);
        return op.getResult();
    }


    /**
     * 比较计算符的优先级
     * @param a 第一个计算符，不包括括号
     * @param b 第二个计算符，不包括括号
     * @return 如果a计算符优先b，返回1，否则返回-1， 若相同返回0
     */
    public int compareOperation(char a, char b) {
        if ((String.valueOf(a).matches("[×÷^]")) && (String.valueOf(b).matches("[×÷^]"))) {
            return 0;
        }
        if (String.valueOf(a).matches("[×÷^]") && String.valueOf(b).matches("[+-]")) {
            return 1;
        }
        if (String.valueOf(b).matches("[×÷^]") && String.valueOf(a).matches("[+-]")) {
            return -1;
        }
        return 0;
    }
}
