package pl.sda.structure.oop.problem1.tyre;

import java.math.BigDecimal;

public class TyreRunner {

    public static void main(String args[]){


        TyreSpecyfiaction specyfiaction = new TyreSpecyfiaction();

        Tyre t1 = new Tyre("123",specyfiaction);
        Tyre t2 = new Tyre("432",specyfiaction);

        specyfiaction = new TyreSpecyfiaction();


    }

}
