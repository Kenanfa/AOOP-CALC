package Calculator;

public class ResultState implements CalculatorState {

    @Override
    public void memoryButtonPressed(int memoryIndex, CalcController calcController) {
        calcController.saveResultToMemory(memoryIndex);
    }

    @Override
    public void equalsButtonPressed(CalcController calcController) {
        // Already in result state : do nothing
    }

    @Override
    public void expressionButtonPressed(CalcController calcController) {
        calcController.setState(new InputState());
    }

    @Override
    public String toString() {
        return "Result State!";
    }
}
