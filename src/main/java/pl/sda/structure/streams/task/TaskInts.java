package pl.sda.structure.streams.task;

import java.util.Random;
import java.util.stream.Stream;

public class TaskInts {

    public static void main(String args[]){
        TaskInts task = new TaskInts();
        task.execute();
    }

    public void execute() {
        Integer[] arrayCreatedStatic = createArray();
        Integer[] arrayWithRandomCreatedElement = getArrayOfRandomPositiveInts(100_000);

        Integer maxElement1 = findMaxElement(arrayCreatedStatic);
        System.out.println("Max is " + maxElement1);
        Integer maxElement2 = findMaxElement(arrayWithRandomCreatedElement);
        System.out.println("Min is " + maxElement2);

        Integer minElement1 = findMinElement(arrayCreatedStatic);
        System.out.println("Min is: " + minElement1);
        Integer minElement2 = findMinElement(arrayWithRandomCreatedElement);
        System.out.println("Min is:" + minElement2);

        Integer sum1 = sum(arrayCreatedStatic);

    }

    public Integer findMaxElement(Integer[] ints) {
        throw new RuntimeException("TODO");
    }

    public Integer findMinElement(Integer[] ints) {
        throw new RuntimeException("TODO");
    }

    public Integer sum(Integer[] ints) {
        throw new RuntimeException("TODO");
    }

    private Integer[] createArray() {
        return new Integer[]{422, 32, 11, 83, 2, 8, 327, 23475, 17, 723, 676243};
    }

    /**
     * Funkcja generuje tablice używajać generator liczb pseudolosowych w javie:
     *
     */
    private Integer[] getArrayOfRandomPositiveInts(int amountOfInts) {
        Integer[] integers = new Integer[amountOfInts];
        Random random = new Random();
        for (int i = 0; i < amountOfInts; i++) {
            int randomInt = random.nextInt();
            randomInt = randomInt > 0 ? randomInt : randomInt * (-1);
            integers[i] = randomInt;
        }
        return integers;
    }

}
