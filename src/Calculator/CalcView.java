package Calculator;

import Factories.View;
import javax.swing.*;
import java.awt.*;


public class CalcView extends View {// Maybe use factory pattern for all panel
    private CalcController calcController;
    private JTextField mainTextField;
    private JLabel resultLabel;


    public CalcView(CalcController calcController) {
        this.calcController = calcController;

        this.setLayout(new GridLayout(3,1));


        addDisplayToView();
        addButtonsToView();
//        buttonM1 = NOT EXPRESSION
//        buttonM2 = NOT EXPRESSION
//        buttonM3 = NOT EXPRESSION
//        buttonM4 = NOT EXPRESSION
//        buttonRes = NOT EXPRESSION

    }

    private void addDisplayToView(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,1));

        mainTextField = new JTextField("");
        mainTextField.setEnabled(false);
        panel.add(mainTextField);

        resultLabel = new JLabel("Result");
        panel.add(resultLabel);

        this.add(panel);
    }

    private void addButtonsToView(){
        JPanel buttonsPanel1 = new JPanel();
        JPanel buttonsPanel2 = new JPanel();

        buttonsPanel1.setLayout(new GridLayout(4,5));
        buttonsPanel2.setLayout(new GridLayout(4,5));

        buttonsPanel1.add(new ExpressionButton("1", calcController));
        buttonsPanel1.add(new ExpressionButton("2", calcController));
        buttonsPanel1.add(new ExpressionButton("3", calcController));
        buttonsPanel1.add(new FunctionalButton("C", calcController,Color.RED));

        buttonsPanel1.add(new JLabel());

        buttonsPanel1.add(new ExpressionButton("4", calcController));
        buttonsPanel1.add(new ExpressionButton("5", calcController));
        buttonsPanel1.add(new ExpressionButton("6", calcController));
        buttonsPanel1.add(new ExpressionButton("+", calcController));
        buttonsPanel1.add(new ExpressionButton("-",calcController));
        buttonsPanel1.add(new ExpressionButton("7", calcController));
        buttonsPanel1.add(new ExpressionButton("8",  calcController));
        buttonsPanel1.add(new ExpressionButton("9", calcController));
        buttonsPanel1.add(new ExpressionButton("*", calcController));
        buttonsPanel1.add(new ExpressionButton("/",  calcController));
        buttonsPanel1.add(new ExpressionButton(".", calcController));
        buttonsPanel1.add(new ExpressionButton("0",  calcController));
        buttonsPanel1.add(new ExpressionButton(",", "", calcController));
        buttonsPanel1.add(new ExpressionButton("(", calcController));
        buttonsPanel1.add(new ExpressionButton(")", calcController));
        buttonsPanel2.add(new ExpressionButton("cos( )", "cos(", calcController));
        buttonsPanel2.add(new ExpressionButton("acos( )", "acos(", calcController));
        buttonsPanel2.add(new ExpressionButton("√", "sqrt(", calcController));
        buttonsPanel2.add(new ExpressionButton("π", "pi", calcController));
        buttonsPanel2.add(new FunctionalButton("=", calcController,Color.GREEN));
        buttonsPanel2.add(new ExpressionButton("sin( )", "sin(", calcController));
        buttonsPanel2.add(new ExpressionButton("asin( )", "asin(", calcController));
        buttonsPanel2.add(new ExpressionButton("^", calcController));
        buttonsPanel2.add(new ExpressionButton("e", calcController));

        buttonsPanel2.add(new JLabel());

        buttonsPanel2.add(new ExpressionButton("tan( )", "tan(", calcController));
        buttonsPanel2.add(new ExpressionButton("atan( )", "atan(", calcController));
        buttonsPanel2.add( new ExpressionButton("ln( )", "ln(", calcController));
        buttonsPanel2.add(new ExpressionButton("log10( )", "log10(", calcController));
        buttonsPanel2.add(new FunctionalButton("RES",calcController,Color.ORANGE));


        buttonsPanel2.add(new MemoryButton("M1",0,calcController,Color.ORANGE));
        buttonsPanel2.add(new MemoryButton("M2",1,calcController,Color.ORANGE));
        buttonsPanel2.add(new MemoryButton("M3",2,calcController,Color.ORANGE));
        buttonsPanel2.add(new MemoryButton("M4",3,calcController,Color.ORANGE));
        buttonsPanel2.add(new MemoryButton("M5",4,calcController,Color.ORANGE));

        this.add(buttonsPanel1);
        this.add(buttonsPanel2);
    }


    public String getTextFieldValue(){
        return mainTextField.getText();
    }

    public String getResultsLabelValue(){
        return resultLabel.getText();
    }

    public void setResultLabelValue(String result){
        resultLabel.setText(result);
    }

    public void setTextFieldValue(String value){
        mainTextField.setText(value);
    }
}
