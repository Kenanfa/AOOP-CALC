import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class UnitConvView extends JPanel { // Maybe use factory pattern for all panel
    JComboBox unitTypeComboBox;
    JComboBox sourceUnitComboBox;
    JComboBox destinationUnitComboBox;
    JTextField textField1;
    JTextField textField2;


    ComboBoxActionListener comboBoxActionListener;
    UnitConvController unitConvController;



    public UnitConvView(UnitConvController unitConvController){
        comboBoxActionListener = new ComboBoxActionListener(this);
        this.unitConvController = unitConvController;

        this.setLayout(new BorderLayout());



        unitTypeComboBox = new JComboBox(UnitsListSource.unitTypes);
        unitTypeComboBox.addActionListener(comboBoxActionListener);
        this.add(unitTypeComboBox,BorderLayout.NORTH    );

        JPanel midPanel = new JPanel();
        midPanel.setLayout(new GridLayout(2,2));

        textField1 = new JTextField("Enter the value");
        textField2 = new JTextField("Result");

        sourceUnitComboBox = new JComboBox();
        destinationUnitComboBox = new JComboBox();

        midPanel.add(textField1);
        midPanel.add(textField2);
        midPanel.add(sourceUnitComboBox);
        midPanel.add(destinationUnitComboBox);

        this.add(midPanel,BorderLayout.CENTER);

        this.add(new JButton("Convert"),BorderLayout.SOUTH);

    }

    public void setSourceUnitComboBoxes(String[] unitsList){
        sourceUnitComboBox.removeAllItems();
        updateComboBox(sourceUnitComboBox,unitsList);
    }

    public void setDestinationUnitComboBox(String[] unitsList){
        destinationUnitComboBox.removeAllItems();
        updateComboBox(destinationUnitComboBox,unitsList);

    }


    private void updateComboBox(JComboBox unitComboBox, String[] unitsList) {

        for(int i = 0; i < unitsList.length;i++){
            unitComboBox.addItem(unitsList[i]);


        }


    }

    public void itemSelected(String selectedItem) {
        unitConvController.unitTypeSelected(selectedItem);
    }
}
