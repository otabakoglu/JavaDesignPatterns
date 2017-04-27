package Factory.Example1;

/**
 * Created by Rubi on 27.04.2017.
 */

public class Bmw extends ArabaFabrika {
    @Override
    public void createAuto() {
        getArabaListesi().add( new Z4(170) );
    }
}
