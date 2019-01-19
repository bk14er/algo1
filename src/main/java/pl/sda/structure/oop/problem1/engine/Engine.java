package pl.sda.structure.oop.problem1.engine;

import java.math.BigDecimal;

public class Engine {

    private EngineSpecyfiaction engineSpecyfiaction;

    //Numer seryjny silnika
    private String serialNumber;

    public Engine(EngineSpecyfiaction engineSpecyfiaction, String serialNumber) {
        this.engineSpecyfiaction = engineSpecyfiaction;
        this.serialNumber = serialNumber;
    }
}
