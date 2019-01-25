package pl.sda.algorithm.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.sda.algorithm.sort.QuickSort;

public class QuickSortTest {

    private QuickSort quickSort;

    @Before
    public void SetUp() throws Exception {
        quickSort = new QuickSort();
    }

    @Test
    public void sort1() throws Exception {
        int[] array = {15, 3, 2, 1, 9, 5, 7, 8, 6};

        int[] sorted = quickSort.sort(array);

        Assert.assertEquals(1, sorted[0]);
        Assert.assertEquals(2, sorted[1]);
        Assert.assertEquals(3, sorted[2]);
        Assert.assertEquals(5, sorted[3]);
        Assert.assertEquals(6, sorted[4]);
        Assert.assertEquals(7, sorted[5]);
        Assert.assertEquals(8, sorted[6]);
        Assert.assertEquals(9, sorted[7]);
        Assert.assertEquals(15, sorted[8]);

    }

    @Test
    public void sort2() throws Exception {
        int[] array = {1, 3, 2, 1, 5, 7, 7, 6};

        int[] sorted = quickSort.sort(array);

        Assert.assertEquals(1, sorted[0]);
        Assert.assertEquals(1, sorted[1]);
        Assert.assertEquals(2, sorted[2]);
        Assert.assertEquals(3, sorted[3]);
        Assert.assertEquals(5, sorted[4]);
        Assert.assertEquals(6, sorted[5]);
        Assert.assertEquals(7, sorted[6]);
        Assert.assertEquals(7, sorted[7]);

    }

}