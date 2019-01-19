package pl.sda.structure.oop.problem1.engine;

import java.math.BigDecimal;

public abstract class Engine<T extends EngineSpecyfiaction>{

    private T engineSpecyfiaction;

    //Numer seryjny silnika
    private String serialNumber;

    public Engine(T engineSpecyfiaction, String serialNumber) {
        this.engineSpecyfiaction = engineSpecyfiaction;
        this.serialNumber = serialNumber;
    }
}
