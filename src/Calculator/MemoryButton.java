package Calculator;

import java.awt.*;

public class MemoryButton extends Command{
    int memoryIndex;
    private CalcController calcController;
    public MemoryButton(String exp,int memoryIndex, CalcController newCalcController) {
        super(exp);
        this.memoryIndex = memoryIndex;
        this.calcController = newCalcController;
    }

    public MemoryButton(String exp,int memoryIndex, CalcController newCalcController, Color color) {
        super(exp);
        this.calcController = newCalcController;
        this.memoryIndex = memoryIndex;
        this.setBackground(color);
    }

    @Override
    public void execute() {
        calcController.memoryButtonPressed(memoryIndex);
    }
}
