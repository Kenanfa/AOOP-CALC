package Calculator;

import javax.swing.*;

public class FunctionalButton extends Command {
    private String expression;
    private CalcController calcController;

    public FunctionalButton(String symbol, String exp, CalcController newCalcController) {
        super(symbol);
        this.expression = exp;
        this.calcController = newCalcController;
    }

    public FunctionalButton(String exp, CalcController newCalcController) {
        super(exp);
        this.expression = exp;
        this.calcController = newCalcController;
    }

    @Override
    public void execute() {
        calcController.functionalButtonPressed(expression);
    }
}
