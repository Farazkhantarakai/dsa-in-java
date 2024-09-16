package org.example.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

int[] array={6,1,7,2,4,9,0};


//in selection sort it selection sort we have min and temp variables
//        in min it choses the first minimum value and iterate over the whole array
        // if it find the next minimum value it chose that the minimum value
        // and then swap it the firt value to the minum value and keep the sorted value at the left of the array


   int[]  sortArray=     selectionSort(array);

        System.out.println(Arrays.toString(sortArray));

    }


    public static int[] selectionSort(int[] array){


        for(int i=0;i<array.length-1;i++)
        {
            int min=i;
            for (int j=i+1;j<array.length;j++){
                if(array[min] > array[j]){
                    min=j;
//        min= 1
                }
            }
            int temp=array[i];
            array[i]=array[min];
            array[min]=temp;
        }



        return array;
    }


}
