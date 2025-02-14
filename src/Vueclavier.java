import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.*;
import java.util.Observer;
import java.awt.*;


public class Vueclavier extends Panel {

    private final Color[]  ColorTab = {Color.YELLOW, Color.RED, Color.BLUE, Color.GREEN, Color.MAGENTA,Color.ORANGE,Color.BLACK,Color.WHITE};

    private Button[]  ButtonTab = new Button[ColorTab.length];

    public Vueclavier()
    {
        for(int i =0; i<8;i++) {

            Button button = new Button();
            button.setBackground(ColorTab[i]);
            button.setBounds(150+(30*i), 130, 25, 25);
            add(button);
        }

        // Add the button to the frame

    }
    

}
