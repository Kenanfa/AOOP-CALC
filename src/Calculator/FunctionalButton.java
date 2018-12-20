package Calculator;

import java.awt.*;

public class FunctionalButton extends Command {
    private String expression;
    private CalcController calcController;


    public FunctionalButton(String exp, CalcController newCalcController) {
        super(exp);
        this.expression = exp;
        this.calcController = newCalcController;
    }

    public FunctionalButton(String exp, CalcController newCalcController, Color color) {
        super(exp);
        this.expression = exp;
        this.calcController = newCalcController;
        this.setBackground(color);
    }

    @Override
    public void execute() {
        calcController.functionalButtonPressed(expression);
    }
}
