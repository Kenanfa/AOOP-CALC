package Calculator;

public class InputState implements CalculatorState {
    @Override
    public void memoryButtonPressed(int memoryIndex, CalcController calcController) {
        calcController.addSavedValueFromMemory(memoryIndex);
    }



    @Override
    public void equalsButtonPressed(CalcController calcController) {
        calcController.saveLatestResultsValue();
        calcController.setState(new ResultState());
    }

    @Override
    public void expressionButtonPressed(CalcController calcController) {
        // Already in input state : do nothing
    }

    @Override
    public String toString() {
        return "Input State!";
    }
}
