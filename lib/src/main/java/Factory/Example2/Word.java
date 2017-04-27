package Factory.Example2;

/**
 * Created by Rubi on 28.04.2017.
 */

public class Word implements Document {


    @Override
    public String getDocumentType() {
        return "Word";
    }
}
