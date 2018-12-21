package UnitConverter;

import Abstracts.View;
import javax.swing.*;
import java.awt.*;


public class UnitConvView extends View {
    JComboBox unitTypeComboBox;
    JComboBox sourceUnitComboBox;
    JComboBox destinationUnitComboBox;
    JTextField valueTextField;
    JTextField resultTextField;

    UnitTypeComboBoxActionListener unitTypeComboBoxActionListener;
    UnitConvController unitConvController;

    public UnitConvView(UnitConvController unitConvController){
        unitTypeComboBoxActionListener = new UnitTypeComboBoxActionListener(this);
        this.unitConvController = unitConvController;

        this.setLayout(new BorderLayout());


        addUnitTypeCombobox();

        JPanel midPanel = new JPanel();
        midPanel.setLayout(new GridLayout(2,2));

        valueTextField = new JTextField("Enter the value");
        resultTextField = new JTextField("Result");
        resultTextField.setEditable(false);

        sourceUnitComboBox = new JComboBox();
        destinationUnitComboBox = new JComboBox();

        midPanel.add(valueTextField);
        midPanel.add(resultTextField);
        midPanel.add(sourceUnitComboBox);
        midPanel.add(destinationUnitComboBox);

        this.add(midPanel,BorderLayout.CENTER);

        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(e -> unitConvController.convertButtonPressed());

        this.add(convertButton,BorderLayout.SOUTH);
    }

    private void addUnitTypeCombobox(){
        unitTypeComboBox = new JComboBox(UnitsListSource.unitTypes);
        unitTypeComboBox.setSelectedIndex(-1);
        unitTypeComboBox.addActionListener(unitTypeComboBoxActionListener);
        this.add(unitTypeComboBox,BorderLayout.NORTH);

    }

    public void setSourceUnitComboBoxes(String[] unitsList){
        sourceUnitComboBox.removeAllItems();
        updateComboBox(sourceUnitComboBox,unitsList);
    }

    public void setDestinationUnitComboBox(String[] unitsList){
        destinationUnitComboBox.removeAllItems();
        updateComboBox(destinationUnitComboBox,unitsList);

    }

    public void setResultField(String result){
        resultTextField.setText(result);
    }

    private void updateComboBox(JComboBox unitComboBox, String[] unitsList) {
        for(int i = 0; i < unitsList.length;i++){
            unitComboBox.addItem(unitsList[i]);
        }
    }

    public String getTextFieldValue() {
        return valueTextField.getText();
    }

    public String getUnitType(){
        return (String) unitTypeComboBox.getSelectedItem();
    }

    public String getDestinationUnit(){
        return (String) destinationUnitComboBox.getSelectedItem();
    }

    public String getSourceUnit(){
        return (String) sourceUnitComboBox.getSelectedItem();
    }

    public void itemSelected(String selectedItem) {
        unitConvController.unitTypeSelected(selectedItem);
    }


}
