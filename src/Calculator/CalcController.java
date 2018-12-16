package Calculator;

import org.mariuszgromada.math.mxparser.Expression;

import javax.swing.*;
import java.awt.*;

public class CalcController {
    CalcView calcView;

    public CalcController(){
        calcView = new CalcView(this);
    }

    public Component getCalcView() {
        return calcView;
    }

    public void expressionButtonPressed(String exp) {
            calcView.getMainTextField().setText(calcView.getMainTextField().getText() + exp);
    }

    public void functionalButtonPressed(String exp) {
        switch (exp) {
            case "C":
                calcView.getMainTextField().setText("");
                break;
            case "=":
                Expression expression = new Expression(calcView.getMainTextField().getText());
                double result = expression.calculate();
                if(Double.isNaN(result)) {
                    JOptionPane.showMessageDialog(null, "Invalid expression!");
                }
                else {
                    calcView.getMainTextField().setText(Double.toString(result));
                }
        }

    }
}
