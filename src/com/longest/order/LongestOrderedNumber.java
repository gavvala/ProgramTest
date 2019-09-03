package com.longest.order;

public class LongestOrderedNumber {

    public static void main(String[] args) {
	// write your code here
        /*int [] test1 = {1,4,1,4,2,1,3,5,6,2,3,7};
        System.out.printf(" value for test 1 -> %d \n", calculateLongestOrderedNumber(test1));
        int [] test2 = {3,1,4,1,5,9,2,6,5,3,5};
        System.out.printf(" value for test 2 -> %d \n", calculateLongestOrderedNumber(test2));
        int [] test3 = {2,7,1,8,2,8,1};
        System.out.printf(" value for test 3 -> %d \n", calculateLongestOrderedNumber(test3));*/
    }

    public static int calculateLongestOrderedNumber(int[] unorderedNumArray) {
        if (unorderedNumArray.length <= 1) return unorderedNumArray.length;

        int longestOrderedNum = 1;
        int len = 1;
        for (int i = 1; i < unorderedNumArray.length; i++) {
           if ((unorderedNumArray.length - i + len) <= longestOrderedNum)
                return longestOrderedNum;
            if (unorderedNumArray[i] > unorderedNumArray[i-1])
                len++;
            else {
                if (longestOrderedNum < len)
                    longestOrderedNum = len;
                len = 1;
            }
        }
        if (longestOrderedNum < len)
            return len;
        return longestOrderedNum;
    }
}
