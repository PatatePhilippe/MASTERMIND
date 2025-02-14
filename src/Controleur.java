import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Controleur implements ItemListener{

    private Modele monModele;

    public Controleur(Modele monModele){
        this.monModele = monModele;
    }

    public void itemStateChanged(ItemEvent e) {
         if (e.getSource() instanceof List) {
            Integer n = (Integer)e.getItem();
            System.out.println(n);
            this.monModele.changeImage(n);

         }else if (e.getSource() instanceof Checkbox) {
             this.monModele.changeNote(Integer.parseInt(e.getItem().toString().split(" ")[0]));
        }


    }
}
