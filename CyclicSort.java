package com.varun;

import java.util.Arrays;

public class CyclicSort {       //Specifically only for the arrays that has values from range [ 1 to N ]
    public static void main(String[] args) {
        int[] arr = {1};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void cyclicsort(int[] arr) {
       /* in this sorting algo we use while Loop bcuz we again and again check that after
       the swap is the value now correct at that particular index */

         int index = 0;

         while (index < arr.length-1){
             if(arr[index] != (index+1)){
                 swap(arr,index,arr[index]-1);  //here we are passing indexs of the elements to be swapped not the elements
             }
             else{
                 index++;
             }
         }
    }

    static void swap (int[]arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
