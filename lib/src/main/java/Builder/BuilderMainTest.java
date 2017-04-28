package Builder;

/**
 * Created by Rubi on 28.04.2017.
 */

public class BuilderMainTest {
    
    public static void main(String[] args){

        SiparisManager order = new SiparisManager();
        order.createOrder( "Ford", "a4", "red", 100);
        order.printOrder();
    }
}
