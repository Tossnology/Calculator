package view;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import module.ButtonMapper;
import module.Parser;

import java.util.ArrayList;
import java.util.List;


/**
 * 计算器界面控制器
 */
public class interfaceController {

    @FXML
    private VBox rootpane;

    @FXML
    private Text equation_text1;

    @FXML
    private Text answer_text1;

    @FXML
    private Text answer_text2;

    @FXML
    private VBox rootpane1;

    @FXML
    private Text equation_text2;

    private double ans = 0; // 答案值，保存临时计算结果
    private boolean calculated = false; // 记录在键入下一个字符前，是否刚刚经过了计算
    private Parser parser = new Parser(); // 解析器
    private List<String> equationList = new ArrayList<String>(); //保存当前在计算器输入的计算式内容

    private Text getCurrentEquationText() {
        return rootpane.isVisible()? equation_text1 : equation_text2;
    }

    private Text getCurrentAnswerText() {
        return rootpane.isVisible()? answer_text1 : answer_text2;
    }

    @FXML
    void handleClearError(ActionEvent event) {
        updateEquationText(ButtonMapper.CLEAR_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handleBackSpace(ActionEvent event) {
        updateEquationText(ButtonMapper.BACKSPACE_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handlePercent(ActionEvent event) {
        updateEquationText(ButtonMapper.PERCENT_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handleClear(ActionEvent event) {
        updateEquationText(ButtonMapper.CLEAR_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handleFraction(ActionEvent event) {
        updateEquationText(ButtonMapper.FRACTION_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handleRoot(ActionEvent event) {
        updateEquationText(ButtonMapper.ROOT_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handleSquare(ActionEvent event) {
        updateEquationText(ButtonMapper.SQUARE_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handleDivision(ActionEvent event) {
        updateEquationText(ButtonMapper.DIVISION_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handleSeven(ActionEvent event) {
        updateEquationText(ButtonMapper.SEVEN_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handleEight(ActionEvent event) {
        updateEquationText(ButtonMapper.EIGHT_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    public void handleNine(ActionEvent event) {
        updateEquationText(ButtonMapper.NINE_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handleMul(ActionEvent event) {
        updateEquationText(ButtonMapper.MULTIPLY_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handleFour(ActionEvent event) {
        updateEquationText(ButtonMapper.FOUR_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handleFive(ActionEvent event) {
        updateEquationText(ButtonMapper.FIVE_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handleSix(ActionEvent event) {
        updateEquationText(ButtonMapper.SIX_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handleMinus(ActionEvent event) {
        updateEquationText(ButtonMapper.MINUS_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handleOne(ActionEvent event) {
        updateEquationText(ButtonMapper.ONE_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handleTwo(ActionEvent event) {
        updateEquationText(ButtonMapper.TWO_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handleThree(ActionEvent event) {
        updateEquationText(ButtonMapper.THREE_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handleAdd(ActionEvent event) {
        updateEquationText(ButtonMapper.ADD_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handleZero(ActionEvent event) {
        updateEquationText(ButtonMapper.ZERO_BTN, getCurrentAnswerText(), getCurrentEquationText());

    }

    @FXML
    void handleDot(ActionEvent event) {
        updateEquationText(ButtonMapper.DOT_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handleEqual(ActionEvent event) {
        updateEquationText(ButtonMapper.EQUAL_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }


    @FXML
    void handleRBracket(ActionEvent event) {
        if (getCurrentEquationText().equals(equation_text2)) {
            updateEquationText(ButtonMapper.RBRACKET_BTN, getCurrentAnswerText(), getCurrentEquationText());
        }
    }

    @FXML
    void handlePower(ActionEvent event) {
        updateEquationText(ButtonMapper.POWER_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handleSin(ActionEvent event) {
        updateEquationText(ButtonMapper.SIN_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handleCos(ActionEvent event) {
        updateEquationText(ButtonMapper.COS_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handleTan(ActionEvent event) {
        updateEquationText(ButtonMapper.TAN_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handleExp(ActionEvent event) {
        updateEquationText(ButtonMapper.EXP_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handleTenPow(ActionEvent event) {
        updateEquationText(ButtonMapper.TEN_POW_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handleFactorial(ActionEvent event) {
        updateEquationText(ButtonMapper.FACTORIAL_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handlePi(ActionEvent event) {
        updateEquationText(ButtonMapper.PI_BTN, getCurrentAnswerText(), getCurrentEquationText());
    }

    @FXML
    void handleLBracket(ActionEvent event) {
        if (getCurrentEquationText().equals(equation_text2)) {
            updateEquationText(ButtonMapper.LBRACKET_BTN, getCurrentAnswerText(), getCurrentEquationText());
        }
    }

    @FXML
    void handleStandard(ActionEvent event) {
        rootpane.setVisible(true);
        rootpane1.setVisible(false);
    }

    @FXML
    void handleScience(ActionEvent event) {
        rootpane.setVisible(false);
        rootpane1.setVisible(true);
    }

    @FXML
    void handleHistory(ActionEvent event) {

    }

    @FXML
    private void initialize() {
        // Initial text
        equation_text1.setText("");
        answer_text1.setText("0");
        equation_text2.setText("");
        answer_text2.setText("0");
        // 注册键盘事件
        rootpane.setOnKeyTyped(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCharacter().equals("1")) {
                    handleOne(new ActionEvent());
                }
                if (event.getCharacter().equals("2")) {
                    handleTwo(new ActionEvent());
                }
                if (event.getCharacter().equals("3")) {
                    handleThree(new ActionEvent());
                }
                if (event.getCharacter().equals("4")) {
                    handleFour(new ActionEvent());
                }
                if (event.getCharacter().equals("5")) {
                    handleFive(new ActionEvent());
                }
                if (event.getCharacter().equals("6")) {
                    handleSix(new ActionEvent());
                }
                if (event.getCharacter().equals("7")) {
                    handleSeven(new ActionEvent());
                }
                if (event.getCharacter().equals("8")) {
                    handleEight(new ActionEvent());
                }
                if (event.getCharacter().equals("9")) {
                    handleNine(new ActionEvent());
                }
                if (event.getCharacter().equals("0")) {
                    handleZero(new ActionEvent());
                }
                if (event.getCharacter().equals("+")) {
                    handleAdd(new ActionEvent());
                }
                if (event.getCharacter().equals("-")) {
                    handleMinus(new ActionEvent());
                }
                if (event.getCharacter().equals("*")) {
                    handleMul(new ActionEvent());
                }
                if (event.getCharacter().equals("/")) {
                    handleDivision(new ActionEvent());
                }
                if (event.getCharacter().equals("=")) {
                    handleEqual(new ActionEvent());
                }
                if (event.getCharacter().equals("(") || event.getCharacter().equals("（")) {
                    handleLBracket(new ActionEvent());
                }
                if (event.getCharacter().equals(")") || event.getCharacter().equals("）")) {
                    handleRBracket(new ActionEvent());
                }
                if (event.getCharacter().equals(".") || event.getCharacter().equals("。")) {
                    handleDot(new ActionEvent());
                }
            }
        });
        rootpane.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.BACK_SPACE) {
                    handleBackSpace(new ActionEvent());
                }
                if (event.getCode() == KeyCode.ENTER) {
                    handleEqual(new ActionEvent());
                }
                if (event.getCode() == KeyCode.SPACE) {
                    handleEqual(new ActionEvent());
                }
                if (event.getCode() == KeyCode.ESCAPE) {
                    handleClear(new ActionEvent());
                }
            }
        });
        rootpane1.setOnKeyTyped(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCharacter().equals("1")) {
                    handleOne(new ActionEvent());
                }
                if (event.getCharacter().equals("2")) {
                    handleTwo(new ActionEvent());
                }
                if (event.getCharacter().equals("3")) {
                    handleThree(new ActionEvent());
                }
                if (event.getCharacter().equals("4")) {
                    handleFour(new ActionEvent());
                }
                if (event.getCharacter().equals("5")) {
                    handleFive(new ActionEvent());
                }
                if (event.getCharacter().equals("6")) {
                    handleSix(new ActionEvent());
                }
                if (event.getCharacter().equals("7")) {
                    handleSeven(new ActionEvent());
                }
                if (event.getCharacter().equals("8")) {
                    handleEight(new ActionEvent());
                }
                if (event.getCharacter().equals("9")) {
                    handleNine(new ActionEvent());
                }
                if (event.getCharacter().equals("0")) {
                    handleZero(new ActionEvent());
                }
                if (event.getCharacter().equals("+")) {
                    handleAdd(new ActionEvent());
                }
                if (event.getCharacter().equals("-")) {
                    handleMinus(new ActionEvent());
                }
                if (event.getCharacter().equals("*")) {
                    handleMul(new ActionEvent());
                }
                if (event.getCharacter().equals("/")) {
                    handleDivision(new ActionEvent());
                }
                if (event.getCharacter().equals("=")) {
                    handleEqual(new ActionEvent());
                }
                if (event.getCharacter().equals("(") || event.getCharacter().equals("（")) {
                    handleLBracket(new ActionEvent());
                }
                if (event.getCharacter().equals(")") || event.getCharacter().equals("）")) {
                    handleRBracket(new ActionEvent());
                }
                if (event.getCharacter().equals(".") || event.getCharacter().equals("。")) {
                    handleDot(new ActionEvent());
                }
            }
        });
        rootpane1.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.BACK_SPACE) {
                    handleBackSpace(new ActionEvent());
                }
                if (event.getCode() == KeyCode.ENTER) {
                    handleEqual(new ActionEvent());
                }
                if (event.getCode() == KeyCode.SPACE) {
                    handleEqual(new ActionEvent());
                }
                if (event.getCode() == KeyCode.ESCAPE) {
                    handleClear(new ActionEvent());
                }
            }
        });
        rootpane1.setVisible(false);
    }

    /**
     * 更新计算器显示内容
     * 根据传入不同字符决定不同处理方式
     * @param etext 即将添加的内容
     */
    private void updateEquationText(String etext, Text answerText, Text equationText) {
        //处理数字相关内容
        if (etext.matches("[0-9]+")) {
            if (answerText.getText().equals("0")) {
                answerText.setText("");
            }
            // case1: answer text has number, not yet calculateInOrder, then append number
            if (!calculated) {
                answerText.setText(answerText.getText() + etext);
            }
            // case2: answer text has number, has been calculateInOrder, then clear answer text and fill number
            if (calculated) {
                answerText.setText(etext);
            }
            // case3: answer text has no number
            if (answerText.getText().isEmpty()) {
                answerText.setText(etext);
            }
            calculated = false;
        }
        //处理运算符相关内容（不含括号）
        if (etext.matches("[\\+\\-×÷]")) {
            //case1: 在输入运算符之前没有发生计算，则连接答案栏和算式栏的式子，形式为 <算式栏><答案栏><运算符>
            if (!calculated) {
                //ans = parser.calculateInOrder(equation_text1.getText() + answer_text1.getText());  //计算
                String lastOp = getEqautionLastOperation(equationText.getText());
                if (lastOp != null) {
                    //特殊情况：没有发生计算，但是前一个字符是括号
                    if (lastOp.equals(")")) {
                        System.out.println(equationText.getText() + etext);
                        equationText.setText(equationText.getText() + etext);
                        return;
                    } else if (lastOp.equals("(")) {
                        equationText.setText(equationText.getText() + answerText.getText() + etext);
                        answerText.setText("0");
                        return;
                    } else {
                        ans = parser.binaryCalculate(String.valueOf(ans), answerText.getText(), lastOp);
                    }
                } else {
                    ans = Double.valueOf(answerText.getText());
                }
                equationText.setText(equationText.getText() + answerText.getText() + etext);
                answerText.setText(String.valueOf(ans));
                calculated = true;
            }
            //case2: 在输入运算符之前发生了计算，则修改算式栏中最后一个运算符
            if (calculated) {
                String tmp;
                if (!equationText.getText().equals("")) {
                    tmp = equationText.getText().substring(0,equationText.getText().length()-1) + etext;
                } else {
                    tmp = String.valueOf(ans) + etext;
                }
                equationText.setText(tmp);
            }
        }
        //处理括号
        if (etext.matches("[\\)\\(]")) {
            if (etext.equals(ButtonMapper.LBRACKET_BTN)) {
                equationText.setText(equationText.getText() + "(");

            }
            if (etext.equals(ButtonMapper.RBRACKET_BTN) && equationText.getText().contains("(")) {
                //检查答案栏中是否有新输入的数字
                if (!calculated && !answerText.getText().isEmpty()) {
                    equationText.setText(equationText.getText() + answerText.getText());
                }
                equationText.setText(equationText.getText() + ")");
                calculated = false;
            }
        }
        //处理开方
        if (etext.equals(ButtonMapper.ROOT_BTN)
            || etext.equals(ButtonMapper.FRACTION_BTN)
            || etext.equals(ButtonMapper.SQUARE_BTN)) {
            if (answerText.getText().isEmpty()) {
                return;
            }
            answerText.setText(String.valueOf(parser.singleCalculate(answerText.getText(), etext)));
            clearEquationText();
        }
        //处理阶乘
        //处理幂函数
        //处理pi
        //处理三角函数
        //处理EXP
        //处理10幂函数
        //处理小数点
        if (etext.equals(ButtonMapper.DOT_BTN)) {
            //如果答案栏中包含小数点
            if (answerText.getText().contains(ButtonMapper.DOT_BTN)) {
                return;
            }
            answerText.setText(answerText.getText() + ButtonMapper.DOT_BTN);
        }
        //处理计算器操作键相关内容
        if (etext.equals(ButtonMapper.CLEAR_BTN)
            || etext.equals(ButtonMapper.CLEAR_ERROR_BTN)
            || etext.equals(ButtonMapper.BACKSPACE_BTN)
            || etext.equals(ButtonMapper.EQUAL_BTN)) {

            // 退格键
            if (etext.equals(ButtonMapper.BACKSPACE_BTN)) {
                //case1: 如果刚刚计算完，计算器显示的是计算结果，则退格无效
                if (calculated) {
                    return;
                }
                //case2：如果未计算且答案栏显示的是单个数字，则变为0
                if (answerText.getText().matches("[0-9]")) {
                    setAnswerText("0");
                }
                //case3：如果未计算且答案栏显示多个数字，则删去最后一个数字
                else {
                    setAnswerText(answerText.getText().substring(0, answerText.getText().length() - 1));
                }
            }
            //输入的回车键或者 =
            if (etext.equals(ButtonMapper.EQUAL_BTN)) {
                //ans = parser.calculateInOrder(equation_text1.getText() + answer_text1.getText());
                if (getCurrentEquationText().equals(equation_text1)) {
                    String lastOp = getEqautionLastOperation(equationText.getText());
                    if (lastOp != null) {
                        ans = parser.binaryCalculate(String.valueOf(ans), answerText.getText(), lastOp);
                    } else {
                        ans = Double.valueOf(answerText.getText());
                    }
                    calculated = true;
                    clearEquationText();
                    setAnswerText(String.valueOf(ans));
                }
                if (getCurrentEquationText().equals(equation_text2)) {
                    System.out.println(equationText.getText());
                    ans = parser.calculateInOrder(equationText.getText());
                    calculated = true;
                    clearEquationText();
                    setAnswerText(String.valueOf(ans));
                }
            }
            // C键/CE键
            if (etext.equals(ButtonMapper.CLEAR_BTN)
                || etext.equals(ButtonMapper.CLEAR_ERROR_BTN)) {
                clearEquationText();
                calculated = false;
                answerText.setText("0");
            }
        }
        //截取答案长度为13位
        if (answerText.getText().length() >= 14) {
            setAnswerText(answerText.getText().substring(0, 13));
        }
        //处理整型，去除小数点
        if (calculated && (int)Double.valueOf(answerText.getText()).doubleValue() == Double.valueOf(answerText.getText())) {
            setAnswerText(String.valueOf((int)Double.valueOf(answerText.getText()).doubleValue()));
        }
    }

    private void setEquationText(String etext) {
        getCurrentEquationText().setText(etext);
    }

    private void setAnswerText(String etext) {
        getCurrentAnswerText().setText(etext);
    }

    /**
     * 清空当前计算栏中内容
     */
    private void clearEquationText()  {
        getCurrentEquationText().setText("");
    }

    private void clearAnswerText() {
        getCurrentAnswerText().setText("");
    }

    private String getEqautionLastOperation(String s) {
        int len = s.length();
        for (int i = len - 1; i >= 0; i--) {
            if ((s.charAt(i) > '9' || s.charAt(i) < '0')
               ) {
                return String.valueOf(s.charAt(i));
            }
        }
        return null;
    }

}
