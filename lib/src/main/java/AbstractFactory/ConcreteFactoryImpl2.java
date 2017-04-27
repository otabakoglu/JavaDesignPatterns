package AbstractFactory;

/**
 * Created by Rubi on 28.04.2017.
 */

public class ConcreteFactoryImpl2 implements AbstractFactory{
    @Override
    public Elma getElma() {
        return new YesilElma();
    }

    @Override
    public Biber getBiber() {
        return new YesilBiber();
    }
}
