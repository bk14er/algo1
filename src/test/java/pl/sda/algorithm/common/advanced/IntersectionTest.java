package pl.sda.algorithm.common.advanced;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class IntersectionTest {

    private Intersection intersector = new Intersection();

    @Test
    public void arrayIntersectionBruteForce() {

        int[] array1 = { 1,2,4,5,6 };
        int[] array2 = { 2,3,5,7 };
        List<Integer> result = intersector.intersectBruteForce(array1, array2);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(5);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void arrayIntersection() {

        int[] array1 = { 1,2,4,5,6 };
        int[] array2 = { 2,3,5,7 };
        List<Integer> result = intersector.intersectElegant(array1, array2);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(5);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void arrayIntersectionElegant() {

        int[] array1 = { 1,2,4,5,6 };
        int[] array2 = { 2,3,5,7 };
        List<Integer> result = intersector.intersectElegant(array1, array2);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(5);

        Assert.assertEquals(expected, result);
    }

}