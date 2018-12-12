import javax.swing.*;

public class CalcFrame  extends JFrame{
    Controller controller; // do we need it?!
    private final int FRAME_WIDTH = 800;
    private final int FRAME_HEIGHT = 500;
    JTabbedPane tabbedPane;

    UnitConvController unitConvController;
    CalcController calcController;


    public CalcFrame(Controller controller){
        this.controller = controller;

        initializeFrame();
    }

    private void initializeFrame() { // Maybe use builder pattern for building the full frame?!
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
