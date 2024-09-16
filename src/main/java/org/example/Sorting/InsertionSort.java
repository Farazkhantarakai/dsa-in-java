package org.example.Sorting;

public class InsertionSort {

    public static void main(String[] args) {

        int[] array={6,1,7,4,2,9,8,5,3};

     int[] result=   insertionSort(array);

     for(int i=0;i<result.length;i++){
         System.out.print(result[i]);
     }

    }

    public static int[] insertionSort(int[] array){

        for(int i=1;i<array.length;i++){
            int temp=array[i];
            for(int j=i-1;j>=0;j--){
                if(array[j] > temp){
                    array[j+1]=array[j];
               array[j]=temp;
                }
            }






        }



        return array;
    }

}


