package pl.sda.structure.oop.problem1.engine;

import java.math.BigDecimal;

public abstract  class EngineSpecyfiaction {

    // Odrzutowy/ Spalinowy / Elektryczny/ Hybrydowy
    private EngineType engineType;

    // MOC [kW,KM]
    private EnginePower power;

    public EngineSpecyfiaction(EngineType engineType, EnginePower power) {
        this.engineType = engineType;
        this.power = power;
    }
}
