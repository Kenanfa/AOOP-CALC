package Factories;

import javax.swing.*;

// Factory
public abstract class View extends JPanel { // TODO Class name

    public void showMessageDialog(String message){
        JFrame parentFrame = (JFrame) SwingUtilities.getAncestorOfClass(JFrame.class, this);
        JOptionPane.showMessageDialog(parentFrame,message);
    }
}
