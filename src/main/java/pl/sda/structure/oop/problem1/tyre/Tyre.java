package pl.sda.structure.oop.problem1.tyre;

import java.math.BigDecimal;

public final class Tyre {

    //Numer seryjny opon
    private final String serialNumber;

    private final TyreSpecyfiaction tyreSpecyfiaction;


    public Tyre(String serialNumber, TyreSpecyfiaction tyreSpecyfiaction) {
        this.serialNumber = serialNumber;
        this.tyreSpecyfiaction = tyreSpecyfiaction;
    }

}


