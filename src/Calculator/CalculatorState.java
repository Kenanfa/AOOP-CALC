package Calculator;

public interface CalculatorState {
    void memoryButtonPressed(int memoryIndex,CalcController calcController); //
    void equalsButtonPressed(CalcController calcController);
    void expressionButtonPressed(CalcController calcController);

}
