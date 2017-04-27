package Factory.Example2;

/**
 * Created by Rubi on 28.04.2017.
 */

public class DocumentFactory {

    public static Document createDocument( String type ){

        if( type.equals( "PDF" ) ) return new Pdf();
        else if( type.equals( "WORD" ) ) return new Word();
        else throw new RuntimeException( "wrong document type." );

    }
}
