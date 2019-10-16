package module;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 解析器，解析计算式，将输入计算式转换为后缀树表达形式，例如 1 + 3 转化为 1 3 +
 * 同时提供计算后缀树功能
 */
public class Parser {

    private Stack<String> stack = new Stack<String>(); //转换计算式所用的栈

    /**
     * 将输入中缀计算式转化为后缀树形式
     * @param equation 中缀计算式
     * @return 后缀树形式计算式
     */
    private List<String> infix2suffix(String equation) {
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
            if (equation.charAt(i) >= '0' && equation.charAt(i) <= '9') {
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
        System.out.println(infixList);
        for (String s : infixList) {
            if (s.matches("[0-9]+")) {
                suffixList.add(s);
            }
            if (s.matches("[\\+\\-×÷]")) {
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
        return null;
    }

    /**
     * 计算输入计算式的值，计算式形式为计算式前后均为数字或括号字符且计算式格式
     * 正确，无重复运算符或符号。若计算式中没有括号，则按照由左向右计算。
     * @param equation 待计算的计算式
     * @return 计算结果，为浮点形式
     */
    public double calculate(String equation) {
        List<String> suffixList = infix2suffix(equation);
        stack.clear();
        for (String s : suffixList) {
            if (s.matches("[0-9]+")) {
                stack.push(s);
            }
            if (s.matches("[\\+\\-×÷]")) {
                switch (s) {
                    case "+": {

                        break;
                    }
                    case "-": {

                        break;
                    }
                    case "×": {

                        break;
                    }
                    case "÷": {

                        break;
                    }
                }
            }
        }
        return -1;
    }

    /**
     * 比较计算符的优先级
     * @param a 第一个计算符，不包括括号
     * @param b 第二个计算符，不包括括号
     * @return 如果a计算符优先b，返回1，否则返回-1， 若相同返回0
     */
    public int compareOperation(char a, char b) {
        if ((a == '×' || a == '÷') && (b == '×' || b == '÷')) {
            return 0;
        }
        if (a == '×' || a == '÷') {
            return 1;
        }
        if (b == '×' || b == '÷') {
            return -1;
        }
        return 0;
    }
}
