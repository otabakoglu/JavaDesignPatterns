package Builder;

/**
 * Created by Rubi on 28.04.2017.
 */

public class FordSiparisBuilder extends SiparisBuilder {

    public  FordSiparisBuilder(){}

    @Override
    public void setMarka(String marka) {
        getAraba().setMarka( new Marka( marka ) );
    }



    @Override
    public void setModel(String model) {
        getAraba().setModel(new Model( model ) );
    }

    @Override
    public void setRenk(String renk) {
        getAraba().setRenk( renk );
    }

    @Override
    public void setBeygirGucu(int beygirGucu) {
        getAraba().setBeygirGucu( beygirGucu );
    }
}
