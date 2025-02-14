import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.*;
import java.util.Observer;
import java.awt.*;


public class Vueclavier extends Panel {


    public Vueclavier()
    {
        Button button = new Button();
        Button button2 = new Button();
        Button button3 = new Button();
        Button button4 = new Button();
        Button button5 = new Button();
        Button button6 = new Button();
        Button button7 = new Button();
        Button button8 = new Button();

        button.setBackground(Color.GRAY);
        button2.setBackground(Color.BLUE);
        button3.setBackground(Color.RED);
        button4.setBackground(Color.GREEN);
        button5.setBackground(Color.YELLOW);
        button6.setBackground(Color.BLACK);
        button7.setBackground(Color.PINK);
        button8.setBackground(Color.ORANGE);
        // Set the button position on the frame
        button.setBounds(150, 130, 25, 25);
        button2.setBounds(180, 130, 25, 25);
        button3.setBounds(205, 130, 25, 25);
        button4.setBounds(230, 130, 25, 25);
        button5.setBounds(255, 130, 25, 25);
        button6.setBounds(280, 130, 25, 25);
        button7.setBounds(305, 130, 25, 25);
        button8.setBounds(330, 130, 25, 25);

        
       

        // Add the button to the frame

    }
    

}
