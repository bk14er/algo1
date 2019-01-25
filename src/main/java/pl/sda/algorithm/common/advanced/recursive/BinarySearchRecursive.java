package pl.sda.algorithm.common.advanced.recursive;

public class BinarySearchRecursive {

    /**
     * Rekurencyjna wersja algorytmu przeszukiwania binarnego:
     *
     *  if(endIndex< startIndex)
     *      return -1
     *
     *  middleIndex = (startIndex + endIndex) /2
     *
     *  if(array[middleIndex] == elementToFind)
     *      retrn middleIndex
     *
     *  else if (elementToFind < array[middleIndex])
     *      return findElement(array, middleIndex+1 , endIndex, elementToFind)
     *  else
     *      return findElement(array, middleIndex + 1, endIndex, elementToFind)
     */
    public int findElement(int array[], int startIndex, int endIndex, int elementToFind) {


        return -1;

    }

    public int binarySearch(int elementToFind, int[] array) {
        return findElement(array, 0, array.length - 1, elementToFind);
    }
}
