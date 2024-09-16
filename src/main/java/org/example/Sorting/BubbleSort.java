package org.example.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {

/*

buble sort is a simple algorithim in which two adjacent elements  are compared with each other and are swaped if the condition is true

first pass

[6,0,3,5]
 i j i j


in first itereation
6-0 will be compared and swaped
[0,6,3,5]

in second iteration
3 and 6 will compared and swaped
[0,3,6,5]

in thrid iteration
5 and 6 will be swaped
[0,3,5,6]

///////////////////
in simple word in every pass it will sort one element and will place it at the end
 */

int[] numbers={3,1,6,2,4,0};

int[] newArray= bubbleSort(numbers);

        System.out.println(Arrays.toString(newArray));

    }


    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped = false;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
                if(!swapped){
                    break;
                }
            }
            return arr;
        }




        return arr;
    }
}

