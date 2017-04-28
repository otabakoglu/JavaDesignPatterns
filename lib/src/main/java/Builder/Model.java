package Builder;

/**
 * Created by Rubi on 28.04.2017.
 */

public class Model {

    private String model;
    public Model(String model){
        setModel(model);
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String toString(){
        return model;
    }
}
