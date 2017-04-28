package Builder;

/**
 * Created by Rubi on 28.04.2017.
 */

public class SiparisManager {

    private SiparisBuilder builder;

    public Araba createOrder( String marka, String model, String renk, int beygirGucu ){

        if(marka.equals("Ford")){
            builder = new FordSiparisBuilder();
        }else  if(marka.equals("Audi")){
            builder = new AuidSiparisBuilder();
        }
        builder.setMarka( marka );
        builder.setModel( model );
        builder.setRenk( renk );
        builder.setBeygirGucu( beygirGucu );
        return builder.getAraba();
    }

    public void printOrder(){
        System.out.println( "Marka: " + builder.getAraba().getMarka() );
        System.out.println( "Model: " + builder.getAraba().getModel() );
        System.out.println( "Renk: " + builder.getAraba().getRenk() );
        System.out.println( "BeygirGucu: " + builder.getAraba().getBeygirGucu() );
    }

}
