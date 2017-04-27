package AbstractFactory;


/**
 * Created by Rubi on 28.04.2017.
 */

public class AbstractFactoryMain {

    public static void main(String [] args){

        AbstractFactory factory = new ConcreteFactoryImpl();
        Elma elma = factory.getElma();
        Biber biber = factory.getBiber();
        System.out.println( elma.getType() );
        System.out.println( biber.getType() );

        factory = new ConcreteFactoryImpl2();
        elma = factory.getElma();
        biber = factory.getBiber();
        System.out.println( elma.getType() );
        System.out.println( biber.getType() );
    }
}
