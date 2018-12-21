package Calculator;

import org.mariuszgromada.math.mxparser.Expression;
import java.awt.*;

public class CalcController {
    CalcView calcView;
    private CalculatorState calculatorState;
    private Memory memory;

    public CalcController(){
        calcView = new CalcView(this);
        memory = Memory.getInstance();
        calculatorState = new InputState();
    }

    public Component getCalcView() {
        return calcView;
    }

    public void expressionButtonPressed(String exp) {
        calculatorState.expressionButtonPressed(this);
        appendToDisplayedExpression(exp);
    }

    public void functionalButtonPressed(String exp) {
        switch (exp) {
            case "RES":
                if(memory.latestResultIsSet()){
                    appendToDisplayedExpression(memory.getLatestResultValue());

                    // RES can be treated as an expression
                    calculatorState.expressionButtonPressed(this);
                }else{
                    calcView.showMessageDialog("You haven't performed any evaluations yet!");
                }
                break;
            case "C":
                calcView.setTextFieldValue("");
                calcView.setResultLabelValue("Result");

                // C can be treated as an expression
                calculatorState.expressionButtonPressed(this);
                break;

            case "=":
                String text = calcView.getTextFieldValue();
                if(text.equals("")){
                    calcView.showMessageDialog("Please enter an expression!");
                    return;
                }
                Expression expression = new Expression(text);

                double result = expression.calculate();
                if(Double.isNaN(result)) {
                    calcView.showMessageDialog("Invalid expression!");
                }
                else {
                    calcView.setResultLabelValue(Double.toString(result));
                    calculatorState.equalsButtonPressed(this);

                }
                break;
            case "⌫":
                text = calcView.getTextFieldValue();
                if(!text.equals("")) {
                    calcView.setTextFieldValue(text.substring(0, text.length()-1));
                }

        }

    }

    private void appendToDisplayedExpression(String string){
        calcView.setTextFieldValue(calcView.getTextFieldValue()+ string);
    }

    public void setState(CalculatorState newCalculatorState){
        calculatorState=newCalculatorState;
    }

    public void memoryButtonPressed(int memoryIndex) {
        calculatorState.memoryButtonPressed(memoryIndex,this);
    }

    public void saveLatestResultsValue() {
        memory.setLatestResultValue(calcView.getResultsLabelValue());
    }

    public void saveResultToMemory(int memoryIndex){
        String result = calcView.getResultsLabelValue();
        if(result.equals("Result")) {
            calcView.showMessageDialog("There is no value in the results field!");
            return;
        }
        memory.setMemoryValue(memoryIndex,result);
        calcView.showMessageDialog("Result is saved to M"+(memoryIndex+1));
    }

    public void addSavedValueFromMemory(int memoryIndex) {
        if(memory.memoryValueIsEmpty(memoryIndex)){
            calcView.showMessageDialog("There is no value saved in this memory slot!");
            return;
        }
        appendToDisplayedExpression(memory.getMemoryValue(memoryIndex));
    }
}
