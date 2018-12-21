package Calculator;


public class ExpressionButton extends Command{
    private String expression;
    private CalcController calcController;

    public ExpressionButton(String symbol, String exp, CalcController newCalcController) {
        super(symbol);
        this.expression = exp;
        this.calcController = newCalcController;
    }

    public ExpressionButton(String exp, CalcController newCalcController) {
        super(exp);
        this.expression = exp;
        this.calcController = newCalcController;
    }

    @Override
    public void execute() {
        calcController.expressionButtonPressed(expression);
    }
}
