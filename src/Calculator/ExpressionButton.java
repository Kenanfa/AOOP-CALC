package Calculator;

public class ExpressionButton extends Command{
    private String expression;
    private CalcController calcController;

    public ExpressionButton(String exp, CalcController newCalcController) {
        super();
        this.expression = exp;
        this.calcController = newCalcController;
    }

    @Override
    public void execute() {

    }
}
