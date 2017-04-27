package Factory.Example1;

import java.util.ArrayList;

/**
 * Created by Rubi on 27.04.2017.
 */

public abstract class ArabaFabrika {

    private ArrayList<Araba> arabaListesi = new ArrayList<Araba>();

    public ArabaFabrika(){
        this.createAuto();
    }
    public abstract void createAuto();

    public ArrayList<Araba> getArabaListesi(){
        return  arabaListesi;
    }

    public void setArabaListesi( ArrayList<Araba> arabaListesi ){
        this.arabaListesi = arabaListesi;
    }
}
