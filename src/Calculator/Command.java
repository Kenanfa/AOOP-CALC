package Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Command extends JButton {

    Command(){
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
