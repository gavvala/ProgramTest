package com.longest.order;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestOrderedNumberTest {

    @Test
    public void Example1() {
        int [] numberArray = {1,4,1,4,2,1,3,5,6,2,3,7};
        assertEquals(4, LongestOrderedNumber.calculateLongestOrderedNumber(numberArray));
    }
    @Test
    public void Example2() {
        int [] numberArray = {3,1,4,1,5,9,2,6,5,3,5};
        assertEquals(3, LongestOrderedNumber.calculateLongestOrderedNumber(numberArray));
    }

    @Test
    public void Example3() {
        int [] numberArray = {2,7,1,8,2,8,1};
        assertEquals(2, LongestOrderedNumber.calculateLongestOrderedNumber(numberArray));
    }


}