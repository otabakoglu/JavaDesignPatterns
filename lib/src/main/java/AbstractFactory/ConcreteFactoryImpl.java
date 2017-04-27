package AbstractFactory;

/**
 * Created by Rubi on 28.04.2017.
 */

public class ConcreteFactoryImpl implements AbstractFactory {
    @Override
    public Elma getElma() {
        return new KirmiziElma();
    }

    @Override
    public Biber getBiber() {
        return new DolmaBiber();
    }
}
