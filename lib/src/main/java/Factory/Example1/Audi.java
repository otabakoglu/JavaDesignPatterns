package Factory.Example1;

/**
 * Created by Rubi on 27.04.2017.
 */

public class Audi extends ArabaFabrika {
    @Override
    public void createAuto() {
        getArabaListesi().add( new A4( 120 ));
        getArabaListesi().add( new R8( 350 ));
    }
}
