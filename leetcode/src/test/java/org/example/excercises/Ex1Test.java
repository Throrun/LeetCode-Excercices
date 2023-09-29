package org.example.excercises;

import junit.framework.TestCase;

import java.util.Arrays;

public class Ex1Test extends TestCase {

    Ex1 cut = new Ex1();

    public void testMerge() {
        int[] firstTestArray = new int[]{1,3,5,6,8,12,43,54,344,435};
        int[] secondTestArray = new int[]{1,3,22,33,44,55,344,435};
        int m = firstTestArray.length;
        int n = secondTestArray.length;
        int[] result = cut.merge(m,n,firstTestArray,secondTestArray);
        int[] expectedResult = new int[]{1,1,3,3,5,6,8,12,22,33,43,44,54,55,344,344,435,435};
        assertEquals(Arrays.toString(result) ,Arrays.toString(expectedResult));
    }
}