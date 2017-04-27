package Factory.Example1;

import java.util.ArrayList;

public class FactoryMain {

      public static void main(String[] args) {

            ArabaFabrika audiFabrika = new Audi();
            for (Araba audiAraba: audiFabrika.getArabaListesi()){
                  System.out.println(
                          audiAraba.getMarka() + " " +
                          audiAraba.getModel() + " " +
                          audiAraba.getBeygirGucu()
                  );
            }


            ArabaFabrika bmwFabrika = new Bmw();
            for (Araba bmwAraba: bmwFabrika.getArabaListesi()){
                  System.out.println(
                          bmwAraba.getMarka() + " " +
                          bmwAraba.getModel() + " " +
                          bmwAraba.getBeygirGucu()
                  );
            }

      }


}
