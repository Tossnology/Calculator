package module;


import java.util.List;

/**
 * 解析器，解析计算式，将输入计算式转换为后缀树表达形式，例如 1 + 3 转化为 1 3 +
 * 同时提供计算后缀树功能
 */
public class Parser {

    /**
     * 将输入中缀计算式转化为后缀树形式
     * @param equation 中缀计算式
     * @return 后缀树形式计算式
     */
    private List<String> infix2suffix(List<String> equation) {
        return null;
    }

    /**
     * 计算输入计算式的值，计算式形式为计算式前后均为数字或括号字符且计算式格式
     * 正确，无重复运算符或符号
     * @param equation 待计算的计算式
     * @return 计算结果，为浮点形式
     */
    public double calculate(List<String> equation) {
        infix2suffix(equation);
        return -1;
    }
}
