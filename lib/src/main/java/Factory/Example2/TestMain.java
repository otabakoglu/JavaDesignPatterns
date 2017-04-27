package Factory.Example2;


/**
 * Created by Rubi on 28.04.2017.
 */

public class TestMain {

    public static void main(String[] args){

        Document document = DocumentFactory.createDocument( "PDF" );
        System.out.println( document.getDocumentType() );

        document = DocumentFactory.createDocument( "WORD" );
        System.out.println( document.getDocumentType() );
    }

}