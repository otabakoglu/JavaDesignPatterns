package Factory.Example2;

/**
 * Created by Rubi on 28.04.2017.
 */

public class Pdf implements Document {



    @Override
    public String getDocumentType() {
        return "PDF";
    }
}
