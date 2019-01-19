package pl.sda.structure.oop.problem6;

import pl.sda.structure.oop.problem6.operation.BasicOperation;
import pl.sda.structure.oop.problem6.operation.Expression;
import pl.sda.structure.oop.problem6.operation.Operation;

import java.util.ArrayList;
import java.util.List;

public class ExpressionCalculator {

    List<BasicOperation> operationList = new ArrayList<>();

    public void addOperation(BasicOperation expression) {
        operationList.add(expression);
    }

    public Integer evaluateAll() {
        Integer result = 0;

        /**Iteruj po wszystkich wyrażeniach tj. expressions
         * i przepisuj je do tymczasowej listy
         * Jeśli liczba wyrażeń osiąnie wartość 3. tj. temp.size() == 3
         * Pobierz te 3 wyrażanie i będą to odpowiednio:
         *      na miejscu 0 będzie obiekt typu Expression
         *      na miejscu 1 będzie obiekt typu Operation
         *      na miejscu 2 będzie obiekt typu Expression
         *      I teraz w zaleznośći o operacji wyznacz wynik działa tych 3 składników
         *      Wyczyść tablice
         *      i zapisz nowy wynik do tablicy tymczasowej
         *
         *
         **/

        return result;
    }

}
