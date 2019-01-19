package pl.sda.structure.oop.problem6.operation;


/**
 *
 *
 * Klasa reprezentuje operacje wykonywane w kalkulatorze tj.
 *
 *  Dodawania (znak "+")
 *  Odejmowanie (znak "-")
 *  Mnozenie (znak "*")
 *  Dzielenie (znak "/")
 *
 */
public class Operation extends BasicOperation {

    private String operation;

    public Operation(String operation) {
        // Sprawdzić czy prawidłowy znak
        // Jeśli nieprawidłowy - rzucamy wyjątek new RuntimeException("Nieprawidłowa operacja");
        this.operation = operation;
    }


    public String getOperation() {
        return operation;
    }
}
