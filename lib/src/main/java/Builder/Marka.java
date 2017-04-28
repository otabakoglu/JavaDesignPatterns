package Builder;

/**
 * Created by Rubi on 28.04.2017.
 */

public class Marka {
    
    private String marka;
    public Marka(String marka){
        setMarka( marka );
    }

    public String getMarka(){
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String toString(){
        return marka;
    }
}
