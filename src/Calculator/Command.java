package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Command extends JButton {


    Command(String label){
        super(label);
        this.setFont(new Font("SansSerif", Font.BOLD, 17));
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Command command = (Command)e.getSource();
                command.execute();
            }
        });
    }

    public abstract void execute();
}