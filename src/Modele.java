import java.awt.*;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Observable;
import java.util.Random;

public class Modele extends Observable {

    private final Color[]  ColorTab = {Color.YELLOW, Color.RED, Color.BLUE, Color.GREEN, Color.MAGENTA,Color.ORANGE,Color.BLACK,Color.WHITE};

    private int tentative=10;

    public static int Difficulite= 4;

    public enum Etat{gagné,perdu,en_cour};

    private Rangee combinaison;

    private Rangee[] Proposition;


    public Modele(){
        Random rand = new Random();
        this.combinaison=new Rangee();
        while (!this.combinaison.ligneComplete()){
            System.out.println("test");
            this.combinaison.addJetons(this.ColorTab[rand.nextInt(0,8)]);
        }
        this.Proposition= new Rangee[this.tentative];
        this.Proposition[0]=new Rangee();
    }

    public Rangee getCombinaison() {
        return combinaison;
    }
    public void addProposition(Color c) {
        if (this.Proposition[this.Proposition.length-this.tentative].ligneComplete()){
            this.tentative-=1;
            this.Proposition[this.Proposition.length-this.tentative]=new Rangee();
        }else{
            this.Proposition[this.Proposition.length-this.tentative].addJetons(c);
            this.Proposition[this.Proposition.length-this.tentative].addResult(this.combinaison.getJetons());
            this.changeImage();
        }
    }
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


    public void changeImage(){
        this.setChanged();
        this.notifyObservers();

    }


    public Color[][] getProposition(){
        Color[][] result=new Color[this.Proposition.length][4];
        int j=0;
        for(Rangee r:this.Proposition){
            j++;
            result[j]=r.getJetons();
        }
        return result;
    }
    public Integer[][] getResult(){
        Integer[][] result=new Integer[this.Proposition.length][4];
        int j=0;
        for(Rangee r:this.Proposition){
            j++;
            LinkedList<Integer> resultOfThePast=r.getResult();
            for(int k=0;k<4;k++){
                result[j][k]=resultOfThePast.get(k);
            }
        }
        return result;
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
