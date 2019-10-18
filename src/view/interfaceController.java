package view;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
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
    private Text equation_text;

    @FXML
    private Text answer_text;

    @FXML
    private Text answer_text1;

    @FXML
    private VBox rootpane1;

    @FXML
    private Text equation_text1;

    private double ans = 0; // 答案值，保存临时计算结果
    private boolean calculated = false; // 记录在键入下一个字符前，是否刚刚经过了计算
    private Parser parser = new Parser(); // 解析器
    private List<String> equationList = new ArrayList<String>(); //保存当前在计算器输入的计算式内容

    @FXML
    void handleClearError(ActionEvent event) {
        updateEquationText(ButtonMapper.CLEAR_BTN);
    }

    @FXML
    void handleBackSpace(ActionEvent event) {
        updateEquationText(ButtonMapper.BACKSPACE_BTN);
    }

    @FXML
    void handlePercent(ActionEvent event) {
        updateEquationText(ButtonMapper.PERCENT_BTN);
    }

    @FXML
    void handleClear(ActionEvent event) {
        updateEquationText(ButtonMapper.CLEAR_BTN);
    }

    @FXML
    void handleFraction(ActionEvent event) {
        updateEquationText(ButtonMapper.FRACTION_BTN);
    }

    @FXML
    void handleRoot(ActionEvent event) {
        updateEquationText(ButtonMapper.ROOT_BTN);
    }

    @FXML
    void handleSquare(ActionEvent event) {
        updateEquationText(ButtonMapper.SQUARE_BTN);
    }

    @FXML
    void handleDivision(ActionEvent event) {
        updateEquationText(ButtonMapper.DIVISION_BTN);
    }

    @FXML
    void handleSeven(ActionEvent event) {
        updateEquationText(ButtonMapper.SEVEN_BTN);
    }

    @FXML
    void handleEight(ActionEvent event) {
        updateEquationText(ButtonMapper.EIGHT_BTN);
    }

    @FXML
    public void handleNine(ActionEvent event) {
        updateEquationText(ButtonMapper.NINE_BTN);
    }

    @FXML
    void handleMul(ActionEvent event) {
        updateEquationText(ButtonMapper.MULTIPLY_BTN);
    }

    @FXML
    void handleFour(ActionEvent event) {
        updateEquationText(ButtonMapper.FOUR_BTN);
    }

    @FXML
    void handleFive(ActionEvent event) {
        updateEquationText(ButtonMapper.FIVE_BTN);
    }

    @FXML
    void handleSix(ActionEvent event) {
        updateEquationText(ButtonMapper.SIX_BTN);
    }

    @FXML
    void handleMinus(ActionEvent event) {
        updateEquationText(ButtonMapper.MINUS_BTN);
    }

    @FXML
    void handleOne(ActionEvent event) {
        updateEquationText(ButtonMapper.ONE_BTN);
    }

    @FXML
    void handleTwo(ActionEvent event) {
        updateEquationText(ButtonMapper.TWO_BTN);
    }

    @FXML
    void handleThree(ActionEvent event) {
        updateEquationText(ButtonMapper.THREE_BTN);
    }

    @FXML
    void handleAdd(ActionEvent event) {
        updateEquationText(ButtonMapper.ADD_BTN);
    }

    @FXML
    void handleZero(ActionEvent event) {
        updateEquationText(ButtonMapper.ZERO_BTN);

    }

    @FXML
    void handleDot(ActionEvent event) {
        updateEquationText(ButtonMapper.DOT_BTN);
    }

    @FXML
    void handleEqual(ActionEvent event) {
        updateEquationText(ButtonMapper.EQUAL_BTN);
    }


    @FXML
    void handleRBracket(ActionEvent event) {

    }

    @FXML
    void handlePower(ActionEvent event) {

    }

    @FXML
    void handleSin(ActionEvent event) {

    }

    @FXML
    void handleCos(ActionEvent event) {

    }

    @FXML
    void handleTan(ActionEvent event) {

    }

    @FXML
    void handleExp(ActionEvent event) {

    }

    @FXML
    void handleTenPow(ActionEvent event) {

    }

    @FXML
    void handleFactorial(ActionEvent event) {

    }

    @FXML
    void handlePi(ActionEvent event) {

    }

    @FXML
    void handleLBracket(ActionEvent event) {

    }

    @FXML
    private void initialize() {
        // Initial text
        equation_text.setText("");
        answer_text.setText("0");
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
    }

    /**
     * 更新计算器显示内容
     * 根据传入不同字符决定不同处理方式
     * @param etext 即将添加的内容
     */
    private void updateEquationText(String etext) {
        //处理数字相关内容
        if (etext.matches("[0-9]+")) {
            if (answer_text.getText().equals("0")) {
                answer_text.setText("");
            }
            // case1: answer text has number, not yet calculateInOrder, then append number
            if (!calculated) {
                answer_text.setText(answer_text.getText() + etext);
            }
            // case2: answer text has number, has been calculateInOrder, then clear answer text and fill number
            if (calculated) {
                answer_text.setText(etext);
            }
            // case3: answer text has no number
            if (answer_text.getText().isEmpty()) {
                answer_text.setText(etext);
            }
            calculated = false;
        }
        //处理运算符相关内容（不含括号）
        if (etext.matches("[\\+\\-×÷]")) {
            //case1: 在输入运算符之前没有发生计算，则连接答案栏和算式栏的式子，形式为 <算式栏><答案栏><运算符>
            if (!calculated) {
                //ans = parser.calculateInOrder(equation_text.getText() + answer_text.getText());  //计算
                String lastOp = getEqautionLastOperation(equation_text.getText());
                if (lastOp != null) {
                    ans = parser.binaryCalculate(String.valueOf(ans), answer_text.getText(), lastOp);
                } else {
                    ans = Double.valueOf(answer_text.getText());
                }
                equation_text.setText(equation_text.getText() + answer_text.getText() + etext);
                answer_text.setText(String.valueOf(ans));
                calculated = true;
            }
            //case2: 在输入运算符之前发生了计算，则修改算式栏中最后一个运算符
            if (calculated) {
                String tmp;
                if (!equation_text.getText().equals("")) {
                    tmp = equation_text.getText().substring(0,equation_text.getText().length()-1) + etext;
                } else {
                    tmp = String.valueOf(ans) + etext;
                }
                equation_text.setText(tmp);
            }
        }
        if (etext.equals(ButtonMapper.ROOT_BTN)
            || etext.equals(ButtonMapper.FRACTION_BTN)
            || etext.equals(ButtonMapper.SQUARE_BTN)) {
            if (answer_text.getText().isEmpty()) {
                return;
            }
            answer_text.setText(String.valueOf(parser.singleCalculate(answer_text.getText(), etext)));
            clearEquationText();
        }
        //处理小数点
        if (etext.equals(ButtonMapper.DOT_BTN)) {
            //如果答案栏中包含小数点
            if (answer_text.getText().contains(ButtonMapper.DOT_BTN)) {
                return;
            }
            answer_text.setText(answer_text.getText() + etext);
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
                if (answer_text.getText().matches("[0-9]")) {
                    setAnswerText("0");
                }
                //case3：如果未计算且答案栏显示多个数字，则删去最后一个数字
                else {
                    setAnswerText(answer_text.getText().substring(0, answer_text.getText().length() - 1));
                }
            }
            if (etext.equals(ButtonMapper.EQUAL_BTN)) {
                //ans = parser.calculateInOrder(equation_text.getText() + answer_text.getText());
                String lastOp = getEqautionLastOperation(equation_text.getText());
                if (lastOp != null) {
                    ans = parser.binaryCalculate(String.valueOf(ans), answer_text.getText(), lastOp);
                } else {
                    ans = Double.valueOf(answer_text.getText());
                }
                calculated = true;
                clearEquationText();
                setAnswerText(String.valueOf(ans));
            }
            // C键/CE键
            if (etext.equals(ButtonMapper.CLEAR_BTN)
                || etext.equals(ButtonMapper.CLEAR_ERROR_BTN)) {
                clearEquationText();
                answer_text.setText("0");
            }
        }
        //截取答案长度为13位
        if (answer_text.getText().length() >= 14) {
            setAnswerText(answer_text.getText().substring(0, 13));
        }
        //处理整型，去除小数点
        if ((int)Double.valueOf(answer_text.getText()).doubleValue() == Double.valueOf(answer_text.getText())) {
            setAnswerText(String.valueOf((int)Double.valueOf(answer_text.getText()).doubleValue()));
        }
    }

    private void setEquationText(String etext) {
        equation_text.setText(etext);
    }

    private void setAnswerText(String etext) {
        answer_text.setText(etext);
    }

    /**
     * 清空当前计算栏中内容
     */
    private void clearEquationText()  {
        equation_text.setText("");
    }

    private void clearAnswerText() {
        answer_text.setText("");
    }

    private String getEqautionLastOperation(String s) {
        int len = s.length();
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0') {
                return String.valueOf(s.charAt(i));
            }
        }
        return null;
    }

}
