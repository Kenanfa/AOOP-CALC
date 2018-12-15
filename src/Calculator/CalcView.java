package Calculator;

import javax.swing.*;

public class CalcView extends JPanel {// Maybe use factory pattern for all panel
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
        button1 = new ExpressionButton("1", calcController);
        button2 = new ExpressionButton("2", calcController);
        button3 = new ExpressionButton("3", calcController);
        button4 = new ExpressionButton("4", calcController);
        button5 = new ExpressionButton("5", calcController);
        button6 = new ExpressionButton("6", calcController);
        button7 = new ExpressionButton("7", calcController);
        button8 = new ExpressionButton("8", calcController);
        button9 = new ExpressionButton("9", calcController);
        button0 = new ExpressionButton("0", calcController);
        buttonPoint = new ExpressionButton(".", calcController);
        buttonComma = new ExpressionButton(",", calcController);
        //buttonClear = ???
        buttonPlus = new ExpressionButton("+", calcController);
        buttonMinus = new ExpressionButton("-", calcController);
        buttonMultiply = new ExpressionButton("*", calcController);
        buttonDivide = new ExpressionButton("/", calcController);
        //buttonEqual = ???
        buttonOpenParenthesis = new ExpressionButton("(", calcController);
        buttonCloseParenthesis = new ExpressionButton(")", calcController);
        buttonCos = new ExpressionButton("cos(", calcController);
        buttonSin = new ExpressionButton("sin(", calcController);
        buttonTan = new ExpressionButton("tan(", calcController);
        buttonInvCos = new ExpressionButton("acos(", calcController);
        buttonInvSin = new ExpressionButton("asin(", calcController);
        buttonInvTan = new ExpressionButton("atan(", calcController);
        buttonSQRT = new ExpressionButton("sqrt(", calcController);
        buttonPI = new ExpressionButton("pi", calcController);
        buttonE = new ExpressionButton("e", calcController);
        buttonLn = new ExpressionButton("ln(", calcController);
        buttonLog10 = new ExpressionButton("log10(", calcController);


    }
}
