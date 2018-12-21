package Abstracts;

import javax.swing.*;

// Factory
public abstract class View extends JPanel {

    public void showMessageDialog(String message){
        JFrame parentFrame = (JFrame) SwingUtilities.getAncestorOfClass(JFrame.class, this);
        JOptionPane.showMessageDialog(parentFrame,message);
    }
}
