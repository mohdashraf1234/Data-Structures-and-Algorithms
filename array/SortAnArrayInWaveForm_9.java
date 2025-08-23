package com.array;

public class SortAnArrayInWaveForm_9 {
	 void sortInWave(int arr[]){
	        int n = arr.length;
	        // swap adjacent elements
	        for (int i=0; i<n-1; i += 2){
	            int temp = arr[i];
	            arr[i] = arr[i+1];
	            arr[i+1] = temp;
	        }
	    }
	 public static void main(String args[]){
		 SortAnArrayInWaveForm_9 ob = new SortAnArrayInWaveForm_9();
	        int arr[] = {1, 2, 3, 4, 5};
	        ob.sortInWave(arr);
	        for (int i : arr){
	            System.out.print(i + " ");
	        }
	    }

}
