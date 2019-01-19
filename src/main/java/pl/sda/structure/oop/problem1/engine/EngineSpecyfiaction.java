package pl.sda.structure.oop.problem1.engine;

import java.math.BigDecimal;

public class EngineSpecyfiaction {


    // Odrzutowy/ Spalinowy / Elektryczny/ Hybrydowy
    private EngineType engineType;

    // MOC [kW,KM]
    private EnginePower power;

    // Pojemność silnika
    private BigDecimal engineCapacity;


    public EngineSpecyfiaction(EngineType engineType, EnginePower power, BigDecimal engineCapacity) {
        this.engineType = engineType;
        this.power = power;
        this.engineCapacity = engineCapacity;
    }
}
