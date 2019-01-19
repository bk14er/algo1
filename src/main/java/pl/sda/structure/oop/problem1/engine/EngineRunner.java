package pl.sda.structure.oop.problem1.engine;

import java.math.BigDecimal;

public class EngineRunner {


    public static void main(String args[]){

        EngineSpecyfiaction specyfiaction = new EngineSpecyfiaction(
                EngineType.ELETRYCZNY,new EnginePower(EngineUnit.KM, BigDecimal.TEN),
                new BigDecimal(123.23));


        Engine engine1= new Engine(specyfiaction,"12340-123");


        Engine engine2 = new Engine(specyfiaction,"213231-3213");




    }

}
