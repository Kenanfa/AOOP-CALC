package UnitConverter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxActionListener implements ActionListener {
    UnitConvView panel;

    public ComboBoxActionListener(UnitConvView panel){ // maybe some pattern should be applied to panels so they would have comboactionlistener selected
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox comboBox = (JComboBox)e.getSource();
        String selectedUnitType = (String)comboBox.getSelectedItem();
        panel.itemSelected(selectedUnitType);

    }
}
