package com.algorithm;
//Define a class named BinarySearchExample
class BinarySearchExample {  
 // Static method to perform binary search
 public static void binarySearch(int arr[], int first, int last, int key) {      
     // Calculate the middle index of the current search range
     int mid = (first + last) / 2;      
     // Continue searching while the first index is less than or equal to the last
     while (first <= last) {         
         // If the key is greater than the middle element, search the right half
         if (arr[mid] < key) {  
             first = mid + 1;  // Move the first index to mid + 1          
         // If the key is equal to the middle element, key is found
         } else if (arr[mid] == key) {  
             System.out.println("Element is found at index: " + mid);  // Print the index  
             break;  // Exit the loop, key is found      
         // If the key is smaller than the middle element, search the left half
         } else {  
             last = mid - 1;  // Move the last index to mid - 1  
         }     
         // Recalculate the middle index for the new range
         mid = (first + last) / 2;  
     }       
     // If the loop ends and the element was not found
     if (first > last) {  
         System.out.println("Element is not found!");  // Notify user  
     }  
 }  
 // Main method - the program starts execution here
 public static void main(String args[]) {  
     // Declare and initialize a sorted array
     int arr[] = {10, 20, 30, 40, 50};      
     // Element to be searched
     int key = 20;      
     // Get the index of the last element
     int last = arr.length - 1;     
     // Call the binarySearch method with the array, start index, end index, and key
     binarySearch(arr, 0, last, key);     
 }  
}
