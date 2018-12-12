import javax.swing.*;
import java.awt.*;

public class UnitConvView extends JPanel { // Maybe use factory pattern for all panel
    JComboBox unitTypeComboBox;
    JComboBox unitComboBox1;
    JComboBox unitComboBox2;
    JTextField textField1;
    JTextField textField2;


    ComboBoxActionListener comboBoxActionListener;
    UnitConvController unitConvController;

    final static String[] unitTypes = { "Volume", "Length", "Weight", "Currency"};

    public UnitConvView(UnitConvController unitConvController){
        comboBoxActionListener = new ComboBoxActionListener(this);
        this.unitConvController = unitConvController;

        this.setLayout(new BorderLayout());



        unitTypeComboBox = new JComboBox(unitTypes);
        unitTypeComboBox.addActionListener(comboBoxActionListener);
        this.add(unitTypeComboBox,BorderLayout.NORTH);

        JPanel midPanel = new JPanel();
        midPanel.setLayout(new GridLayout(2,2));

        textField1 = new JTextField("Enter the value");
        textField2 = new JTextField("Result");

        unitComboBox1 = new JComboBox();
        unitComboBox2 = new JComboBox();

        midPanel.add(textField1);
        midPanel.add(textField2);
        midPanel.add(unitComboBox1);
        midPanel.add(unitComboBox2);

        this.add(midPanel,BorderLayout.CENTER);

        this.add(new JButton("Convert"),BorderLayout.SOUTH);

    }

    public void setUnitComboBoxes(String[] units1, String[] units2){
        unitTypeComboBox.removeAllItems();

    }

    public void itemSelected(String selectedItem) {
        unitConvController.unitTypeSelected(selectedItem);
    }
}
