import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Random;

public class Modele extends Observable {


    public Modele(){


        /*
        File fichier = new File("src/images.xml");
        XMLDecoder xmlDecoder = null;
        try{
            FileInputStream fis = new FileInputStream(fichier);
            ObjectInputStream bis = new ObjectInputStream(fis);
            xmlDecoder = new XMLDecoder(bis);
            this.imageModeleArrayList=(ArrayList<ImageModele>)xmlDecoder.readObject();

        }catch(IOException e){
            for (String image : images) {
                this.imageModeleArrayList.add(new ImageModele());
                this.imageModeleArrayList.get(this.imageModeleArrayList.size()-1).setNom(image);
                this.imageModeleArrayList.get(this.imageModeleArrayList.size()-1).setLien("images\\"+image+".jpg");
                this.imageModeleArrayList.get(this.imageModeleArrayList.size()-1).setNote(0);
            }
        }finally{
            if(xmlDecoder != null){xmlDecoder.close();}
        }
        for(ImageModele img : imageModeleArrayList){
            System.out.println(img);
        }

        */

    }
    public void changeImage(int i){

        this.setChanged();
        this.notifyObservers();

    }
    /*
    public void enregistrer() throws IOException {
        XMLEncoder xmlEncoder = null;
        try{
            File fichier = new File("src/images.xml");
            FileOutputStream fos = new FileOutputStream(fichier);
            ObjectOutputStream bos = new ObjectOutputStream(fos);
            xmlEncoder = new XMLEncoder(bos);
            xmlEncoder.writeObject(this.imageModeleArrayList);
            xmlEncoder.flush();

        }catch(IOException e){
            e.printStackTrace();
            System.out.println("problème ecriture du fichier");
        }finally{
            if(xmlEncoder != null){xmlEncoder.close();}
        }

    }

     */


}
