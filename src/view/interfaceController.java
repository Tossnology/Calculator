package view;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
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
    private AnchorPane rootpane;

    @FXML
    private Button two_btn;

    @FXML
    private Button one_btn;

    @FXML
    private Text equation_text;

    @FXML
    private Button percent_btn;

    @FXML
    private Button dot_btn;

    @FXML
    private Button equal_btn;

    @FXML
    private Button backspace_btn;

    @FXML
    private Button minus_btn;

    @FXML
    private Button fraction_btn;

    @FXML
    private Button addition_btn;

    @FXML
    private Button multiply_btn;

    @FXML
    private Button division_btn;

    @FXML
    private Button six_btn;

    @FXML
    private Button clearerror_btn;

    @FXML
    private Text answer_text;

    @FXML
    private Button seven_btn;

    @FXML
    private Button three_btn;

    @FXML
    private Button four_btn;

    @FXML
    private Button square_btn;

    @FXML
    private Button eight_btn;

    @FXML
    private Button root_btn;

    @FXML
    private Button clear_btn;

    @FXML
    private Button nine_btn;

    @FXML
    private Button five_btn;

    @FXML
    private Button zero_btn;

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
        updateCalculate(ButtonMapper.FRACTION_BTN);
    }

    @FXML
    void handleRoot(ActionEvent event) {
        updateEquationText(ButtonMapper.ROOT_BTN);
        updateCalculate(ButtonMapper.ROOT_BTN);
    }

    @FXML
    void handleSquare(ActionEvent event) {
        updateEquationText(ButtonMapper.SQUARE_BTN);
        updateCalculate(ButtonMapper.SQUARE_BTN);
    }

    @FXML
    void handleDivision(ActionEvent event) {
        updateEquationText(ButtonMapper.DIVISION_BTN);
        updateCalculate(ButtonMapper.DIVISION_BTN);
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
        updateCalculate(ButtonMapper.MULTIPLY_BTN);
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
        updateCalculate(ButtonMapper.MINUS_BTN);
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
        updateCalculate(ButtonMapper.ADD_BTN);
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
        updateCalculate(ButtonMapper.EQUAL_BTN);
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
                if (event.getCode() == KeyCode.ESCAPE) {
                    handleClear(new ActionEvent());
                }
            }
        });
    }

    /**
     * 更新计算器算式栏显示内容
     * 根据传入不同字符决定不同处理方式
     * @param etext 在算式栏即将添加的内容
     */
    private void updateEquationText(String etext) {
        //处理数字相关内容
        if (etext.matches("[0-9]+")) {
            if (answer_text.getText().equals("0")) {
                answer_text.setText("");
            }
            // case1: answer text has number, not yet calculate, then append number
            if (!calculated) {
                answer_text.setText(answer_text.getText() + etext);
                return;
            }
            // case2: answer text has number, has been calculate, then clear answer text and fill number
            if (calculated) {
                answer_text.setText(etext);
                return;
            }
            // case3: answer text has no number
            answer_text.setText(etext);
            return;
        }
        //处理运算符相关内容（不含括号）
        if (etext.matches("[\\+\\-×÷]")) {
            //case1: 在输入运算符之前没有发生计算，则连接答案栏和算式栏的式子，形式为 <算式栏><答案栏><运算符>
            if (!calculated) {
                equation_text.setText(equation_text.getText() + answer_text.getText() + etext);
                answer_text.setText("0"); //TODO 待修改
                return;
            }
            //case2: 在输入运算符之前发生了计算，则修改算式栏中最后一个运算符
            if (calculated) {
                String tmp = equation_text.getText().substring(0,equation_text.getText().length()-1);
                equation_text.setText(tmp + etext);
            }
            return;
        }
        //处理小数点
        if (etext.equals(ButtonMapper.DOT_BTN)) {
            //如果答案栏中包含小数点
            if (answer_text.getText().contains(ButtonMapper.DOT_BTN)) {
                return;
            }
            answer_text.setText(answer_text.getText() + etext);
            return;
        }
        //处理计算器操作键相关内容
        if (etext.equals(ButtonMapper.CLEAR_BTN)
            || etext.equals(ButtonMapper.CLEAR_ERROR_BTN)
            || etext.equals(ButtonMapper.BACKSPACE_BTN)) {

            // 退格键
            if (etext.equals(ButtonMapper.BACKSPACE_BTN)) {
                //case1: 如果刚刚计算完，计算器显示的是计算结果，则退格无效
                if (calculated) {
                    return;
                }
                //case2：如果未计算且答案栏显示的是单个数字，则变为0
                if (answer_text.getText().matches("[0-9]")) {
                    answer_text.setText("0");
                }
                //case3：如果未计算且答案栏显示多个数字，则删去最后一个数字
                else {
                    answer_text.setText(answer_text.getText().substring(0, answer_text.getText().length() - 1));
                }
                return;
            }

            // C键/CE键
            clearEquationText();
            answer_text.setText("0");
            return;
        }
    }

    private void updateCalculate(String op) {
        parser.calculate(op);
    }

    /**
     * 设置算式栏内容
     * @param etext 算式栏内容
     */
    private void setEquationText(String etext) {
        equation_text.setText(etext);
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

}
