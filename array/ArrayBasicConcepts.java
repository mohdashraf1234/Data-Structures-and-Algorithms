package com.array;

public class ArrayBasicConcepts {
	/*
	 * insert
	 * update
	 * delete
	 * reverse
	 * sliceoperation  -sub-array
	 */
	// Delete element from array (returns new array)
    static int[] deleteAtIndex(int[] arr, int index) {
        int[] result = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == index) continue; // skip the element at 'index'
            result[j] = arr[i];
            j++;
        }
        return result;
    }
    
    // Reverse array in-place
    static void reverseArray(int[] arr) {
//        int left = 0, right = arr.length - 1;
//        while (left < right) {
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//            left++;
//            right--;
//        }
    	for (int i = 0; i < arr.length / 2; i++) {  // Only go halfway
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
	public static void main(String[] args) {
		 // 1. Understanding Indexing
        int[] arr = {10, 20, 30, 40, 50};
        // Accessing elements - O(1) time
        System.out.println("First Element:"+arr[0]);
        System.out.println("Last Element:"+arr[arr.length-1]);
        
        System.out.println("----------//// 2. Array Traversal - Forward---------");
        
        for (int i = 0; i < arr.length; i++) { // O(n)
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        System.out.println("-----------Backward traversal----");
        for(int i=arr.length-1;  i>=0;  i--)
        {
        	System.out.print(arr[i]+" ");
        }
        
        System.out.println("--------Every second element:----- ");
        for(int i=0;  i<arr.length;i=i+2)
        {
        	System.out.print(arr[i]+" ");
        }
        
        System.out.println("--------update element-----");
        //update element at index 2 
        arr[2]=100;
        for(int i=0; i<arr.length;i++)
        {
        	System.out.print(arr[i]+" ");
        }
        
        System.out.println("-----copy array---------");
        int[] arr2=new int[arr.length];
        for(int i=0;  i<arr.length; i++)
        {
        	
        		arr2[i]=arr[i];
        	
        }
       
        
        for(int i=0;  i<arr2.length; i++)
        {
        	System.out.print(arr2[i]+" ");
        }
        System.out.println("---delete----");
        
     // 5. Delete operation (Manual)
        int[] deleted = deleteAtIndex(arr, 1); // O(n)
        System.out.println("After deletion: " + java.util.Arrays.toString(deleted));
        
        

        // 6. Slice operation (sub-array)
        int[] sliced = java.util.Arrays.copyOfRange(arr, 1, 4); // O(k)
        System.out.println("Sliced array (index 1 to 3): " + java.util.Arrays.toString(sliced));
       
     // 7. Reverse array (in-place)
        reverseArray(arr); // O(n)
        System.out.println("Reversed array: " + java.util.Arrays.toString(arr));
	}

}
