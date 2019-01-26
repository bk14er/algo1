package pl.sda.algorithm.common.advanced.recursive;

public class BinarySearchRecursive {

    /**
     * Rekurencyjna wersja algorytmu przeszukiwania binarnego:
     * <p>
     * if(endIndex< startIndex)
     * return -1
     * <p>
     * middleIndex = (startIndex + endIndex) /2
     * <p>
     * if(array[middleIndex] == elementToFind)
     * retrn middleIndex
     * <p>
     * else if (elementToFind < array[middleIndex])
     * return findElement(array, middleIndex+1 , endIndex, elementToFind)
     * else
     * return findElement(array, middleIndex + 1, endIndex, elementToFind)
     */
    public int findElement(int array[], int startIndex, int endIndex, int elementToFind) {

        if (startIndex > endIndex) {
            return -1;
        }

        int middle = (startIndex + endIndex) / 2;


        if (array[middle] == elementToFind) {
            return middle;
        }

        if (elementToFind < array[middle]) {
            //Szukanie w lewej połówce
            return findElement(array, startIndex, middle, elementToFind);
        } else {
            return findElement(array, middle, endIndex, elementToFind);
        }
    }

    public int binarySearch(int elementToFind, int[] array) {
        return findElement(array, 0, array.length - 1, elementToFind);
    }
}
