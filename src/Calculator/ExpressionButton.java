package Calculator;

import javax.swing.*;

public class ExpressionButton extends Command{
    private String expression;
    private CalcController calcController;

    public ExpressionButton(String symbol, String exp, CalcController newCalcController) {
        super(symbol);
        this.expression = exp;
        this.calcController = newCalcController;
    }

    @Override
    public void execute() {
        calcController.setMainTextField(expression);
    }
}
