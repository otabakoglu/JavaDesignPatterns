package Factory.Example1;

/**
 * Created by Rubi on 27.04.2017.
 */

public abstract class Araba {

    private String marka = null;
    private String model = null;
    private int beygirGucu = 0;

    public Araba ( String marka, String model, int beygirGucu ){
        setMarka( marka );
        setModel( model );
        setBeygirGucu( beygirGucu );
    }


    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBeygirGucu(int beygirGucu) {
        this.beygirGucu = beygirGucu;
    }

    public String getMarka(){
        return marka;
    }
    public String getModel(){
        return model;
    }
    public int getBeygirGucu(){
        return beygirGucu;
    }
}
