package pl.sda.structure.oop.problem1.engine;

import java.math.BigDecimal;

public class EngineRunner {


    public static void main(String args[]){


        EnginePower enginePower = new EnginePower(EngineUnit.KM, BigDecimal.TEN),
                new BigDecimal(123.23);

        CommonEngineSpecyfication commonSpecyfiaction = new CommonEngineSpecyfication(
                EngineType.SPALINOWEGO,enginePower);

        ElectricalEngineSpecyfication electricalEngineSpecyfication = new ElectricalEngineSpecyfication(
                EngineType.SPALINOWEGO,enginePower);

        Engine engine1= new ElectricalEngine(electricalEngineSpecyfication,"12340-123");

        Engine engine2 = new OtherEngine(commonSpecyfiaction,"213231-3213");




    }

}
