package src;
import javax.swing.*;
import java.awt.event.*;

public class GUI extends javax.swing.JFrame {
    JFrame frame;
    JButton button;
    Main main;

    public GUI(){

        main = new Main(this);

        frame = new JFrame();
        frame.setSize(200, 400);
        frame.setLayout(null);
        frame.setTitle("People listing application");
    
        button = new JButton("Test Button");
        button.setBounds(15, 100, 200, 20);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                button.setText("Button was pressed!");
            }
        });
        frame.add(button);
        frame.setVisible(true);
    
    }
}