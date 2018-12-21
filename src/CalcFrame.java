import Calculator.CalcController;
import UnitConverter.UnitConvController;

import javax.swing.*;

public class CalcFrame  extends JFrame{

    private final int FRAME_WIDTH = 450;
    private final int FRAME_HEIGHT = 650;
    JTabbedPane tabbedPane;

    UnitConvController unitConvController;
    CalcController calcController;


    public CalcFrame(){
        initializeFrame();
    }

    private void initializeFrame() {
        tabbedPane = new JTabbedPane();
        unitConvController = new UnitConvController();
        calcController = new CalcController();


        tabbedPane.add("Calculator",calcController.getCalcView());
        tabbedPane.add("Unit Conversion",unitConvController.getUnitConvView());

        this.add(tabbedPane);
    }

    public void startViewing(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        this.setVisible(true);
    }

}
