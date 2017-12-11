package com.techprimers;

public class LongestIncreasingSubArray {

    public static void main(String[] args) {


        int[] array = new int[]
                {
                        3, 4, 5, 3, 2, 4, 7, 8, 6
                };

        int start = 0, end = 1, length = 1;

        while (end < array.length) {

            if (array[end] > array[end-1]) {
                if ((end - start) + 1 > length) {
                    length = (end - start) + 1;
                }
            } else {
                start = end;
            }

            end++;
        }

        System.out.println(length);

    }
}
