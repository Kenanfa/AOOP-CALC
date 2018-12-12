import java.awt.*;

public class CalcController {
    CalcView calcView;

    public CalcController(){
        calcView = new CalcView(this);
    }

    public Component getCalcView() {
        return calcView;
    }
}
