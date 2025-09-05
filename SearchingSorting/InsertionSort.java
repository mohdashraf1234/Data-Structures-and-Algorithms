package Searchingu.Sorting;

class InsertionSort {
    public static void main(String[] args) {
    	//https://www.youtube.com/watch?v=f-f50FjS_jA
        int[] a = {5, 1, 6, 2};

        int temp, j;
        for (int i = 1; i < a.length; i++) {
            temp=a[i];
            j=i;
            while(j>0 && a[j-1]>temp)
            {
            	a[j]=a[j-1];
            	j=j-1;
            }
            a[j]=temp;
        }

        // Print sorted array
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
