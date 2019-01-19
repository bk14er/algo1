package pl.sda.structure.oop.problem1.engine;

import java.math.BigDecimal;

public class CommonEngineSpecyfication extends EngineSpecyfiaction {

    private BigDecimal engineCapacity;

    public CommonEngineSpecyfication(EngineType engineType, EnginePower power) {
        super(engineType, power);
    }
}
