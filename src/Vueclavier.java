import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.*;
import java.util.Observer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;

import java.awt.*;


public class Vueclavier extends Panel {

    private final Color[]  ColorTab = {Color.YELLOW, Color.RED, Color.BLUE, Color.GREEN, Color.MAGENTA,Color.ORANGE,Color.BLACK,Color.WHITE};

    private JButton[]  ButtonTab = new JButton[ColorTab.length];

    public Vueclavier(ActionListener a)
    {
        for(int i =0; i<8;i++) {

            JButton button = new JButton();
            button.setBackground(ColorTab[i]);
            button.setBounds(170+(30*i), 130, 30, 30);
            button.addActionListener(a);
            add(button);
        }

        // Add the button to the frame

    }
    
    
}

