package Calculator;

import Factories.View;
import javax.swing.*;
import java.awt.*;

public class CalcView extends View {// Maybe use factory pattern for all panel
    private CalcController calcController;
    private JTextField mainTextField;
    private ExpressionButton button1;
    private ExpressionButton button2;
    private ExpressionButton button3;
    private ExpressionButton button4;
    private ExpressionButton button5;
    private ExpressionButton button6;
    private ExpressionButton button7;
    private ExpressionButton button8;
    private ExpressionButton button9;
    private ExpressionButton button0;
    private ExpressionButton buttonPoint;
    private ExpressionButton buttonComma;
    private ExpressionButton buttonClear;
    private ExpressionButton buttonPlus;
    private ExpressionButton buttonMinus;
    private ExpressionButton buttonMultiply;
    private ExpressionButton buttonDivide;
    private ExpressionButton buttonEqual;
    private ExpressionButton buttonOpenParenthesis;
    private ExpressionButton buttonCloseParenthesis;
    private ExpressionButton buttonCos;
    private ExpressionButton buttonSin;
    private ExpressionButton buttonTan;
    private ExpressionButton buttonInvCos;
    private ExpressionButton buttonInvSin;
    private ExpressionButton buttonInvTan;
    private ExpressionButton buttonSQRT;
    private ExpressionButton buttonPow;
    private ExpressionButton buttonPI;
    private ExpressionButton buttonE;
    private ExpressionButton buttonLn;
    private ExpressionButton buttonLog10;
    private ExpressionButton buttonM1;
    private ExpressionButton buttonM2;
    private ExpressionButton buttonM3;
    private ExpressionButton buttonM4;
    private ExpressionButton buttonRes;

    public CalcView(CalcController calcController) {
        this.setLayout(new GridLayout(3,1));

        mainTextField = new JTextField();
        mainTextField.setEnabled(false);

        this.add(mainTextField);

        button1 = new ExpressionButton("1", "1", calcController);
        button2 = new ExpressionButton("2", "2", calcController);
        button3 = new ExpressionButton("3", "3", calcController);
        button4 = new ExpressionButton("4", "4", calcController);
        button5 = new ExpressionButton("5", "5", calcController);
        button6 = new ExpressionButton("6", "6", calcController);
        button7 = new ExpressionButton("7", "7", calcController);
        button8 = new ExpressionButton("8", "8", calcController);
        button9 = new ExpressionButton("9", "9", calcController);
        button0 = new ExpressionButton("0", "0", calcController);
        buttonPoint = new ExpressionButton(".", ".", calcController);
        buttonComma = new ExpressionButton(",", "", calcController);
//        buttonClear = NOT EXPRESSION
        buttonPlus = new ExpressionButton("+", "+", calcController);
        buttonMinus = new ExpressionButton("-", "-", calcController);
        buttonMultiply = new ExpressionButton("*", "*", calcController);
        buttonDivide = new ExpressionButton("/", "/", calcController);
//        buttonEqual = NOT EXPRESSION
        buttonOpenParenthesis = new ExpressionButton("(", "(", calcController);
        buttonCloseParenthesis = new ExpressionButton(")", ")", calcController);
        buttonCos = new ExpressionButton("cos( )", "cos(", calcController);
        buttonSin = new ExpressionButton("sin( )", "sin(", calcController);
        buttonTan = new ExpressionButton("tan( )", "tan(", calcController);
        buttonInvCos = new ExpressionButton("acos( )", "acos(", calcController);
        buttonInvSin = new ExpressionButton("asin( )", "asin(", calcController);
        buttonInvTan = new ExpressionButton("atan( )", "atan(", calcController);
        buttonSQRT = new ExpressionButton("√", "sqrt(", calcController);
        buttonPow = new ExpressionButton("^", "^", calcController);
        buttonPI = new ExpressionButton("π", "pi", calcController);
        buttonE = new ExpressionButton("e", "e", calcController);
        buttonLn = new ExpressionButton("ln( )", "ln(", calcController);
        buttonLog10 = new ExpressionButton("log10( )", "log10(", calcController);
//        buttonM1 = NOT EXPRESSION
//        buttonM2 = NOT EXPRESSION
//        buttonM3 = NOT EXPRESSION
//        buttonM4 = NOT EXPRESSION
//        buttonRes = NOT EXPRESSION

        JPanel buttonsPanel1 = new JPanel();
        JPanel buttonsPanel2 = new JPanel();

        buttonsPanel1.setLayout(new GridLayout(4,5));
        buttonsPanel2.setLayout(new GridLayout(4,5));

        buttonsPanel1.add(button1);
        buttonsPanel1.add(button2);
        buttonsPanel1.add(button3);
        buttonsPanel1.add(new JButton("C"));
        buttonsPanel1.add(new JButton("C"));
        buttonsPanel1.add(button4);
        buttonsPanel1.add(button5);
        buttonsPanel1.add(button6);
        buttonsPanel1.add(buttonPlus);
        buttonsPanel1.add(buttonMinus);
        buttonsPanel1.add(button7);
        buttonsPanel1.add(button8);
        buttonsPanel1.add(button9);
        buttonsPanel1.add(buttonMultiply);
        buttonsPanel1.add(buttonDivide);
        buttonsPanel1.add(buttonPoint);
        buttonsPanel1.add(button0);
        buttonsPanel1.add(buttonComma);
        buttonsPanel1.add(buttonOpenParenthesis);
        buttonsPanel1.add(buttonCloseParenthesis);

        buttonsPanel2.add(buttonCos);
        buttonsPanel2.add(buttonInvCos);
        buttonsPanel2.add(buttonSQRT);
        buttonsPanel2.add(buttonPI);
        buttonsPanel2.add(new JButton("="));
        buttonsPanel2.add(buttonSin);
        buttonsPanel2.add(buttonInvSin);
        buttonsPanel2.add(buttonPow);
        buttonsPanel2.add(buttonE);
        buttonsPanel2.add(new JButton("="));
        buttonsPanel2.add(buttonTan);
        buttonsPanel2.add(buttonInvTan);
        buttonsPanel2.add(buttonLn);
        buttonsPanel2.add(buttonLog10);
        buttonsPanel2.add(new JButton("="));
        buttonsPanel2.add(new JButton("M1"));
        buttonsPanel2.add(new JButton("M2"));
        buttonsPanel2.add(new JButton("M3"));
        buttonsPanel2.add(new JButton("M4"));
        buttonsPanel2.add(new JButton("Res"));

        this.add(buttonsPanel1);
        this.add(buttonsPanel2);

    }

    public JTextField getMainTextField() {
        return mainTextField;
    }
}
