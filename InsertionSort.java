package com.varun;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {5,3,1,4,6};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    public  static void insertion(int[] arr) {
        for (int i =0;i<arr.length-1;i++){  // this loop runs till i <=n-2;
            for(int j=i+1;j>0;j--){
                if(arr[j-1] > arr[j]){
                    swap(arr , j-1,j);
                }else{
                    break;
                }
            }
        }
    }

     static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1]  = arr[index2];
        arr[index2] = temp;
    }
}
