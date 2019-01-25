package pl.sda.algorithm.common.advanced.recursive;

import org.junit.Test;
import pl.sda.algorithm.search.BinarySearchAlgorithm;

import static junit.framework.TestCase.assertEquals;

public class BinarySearchRecursiveTest {

    @Test
    public void testBinarySearch1() {
        BinarySearchRecursive binarySearchAlgorithm = new BinarySearchRecursive();
        int index = binarySearchAlgorithm.binarySearch(4, new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        assertEquals(3, index);
    }

    @Test
    public void testBinarySearch2() {
        BinarySearchRecursive binarySearchAlgorithm = new BinarySearchRecursive();
        int index = binarySearchAlgorithm.binarySearch(5, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        assertEquals(4, index);
    }

    @Test
    public void testBinarySearch3() {
        BinarySearchRecursive binarySearchAlgorithm = new BinarySearchRecursive();
        int index = binarySearchAlgorithm.binarySearch(1, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        assertEquals(0, index);
    }

}