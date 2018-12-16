package Calculator;

import java.awt.*;

public class CalcController {
    CalcView calcView;

    public CalcController(){
        calcView = new CalcView(this);
    }

    public Component getCalcView() {
        return calcView;
    }

    public void setMainTextField(String exp){
        calcView.getMainTextField().setText(calcView.getMainTextField().getText()+exp);
    }
}
