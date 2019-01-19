package pl.sda.structure.oop.problem1.engine;

import java.math.BigDecimal;

public class EnginePower {

    private EngineUnit engineUnit;

    private BigDecimal power;


    public EnginePower(EngineUnit engineUnit, BigDecimal power) {
        this.engineUnit = engineUnit;
        this.power = power;
    }
}
