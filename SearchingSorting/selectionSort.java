package Searchingu.Sorting;

class selectionSort {
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};
        selectionSort ss = new selectionSort();
        ss.selectionSort(arr);

        System.out.println("Sorted Array:");
        ss.printArray(arr);
    }

    void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Assume the minimum is the first element
            int minIndex = i;

            // Find the actual minimum element in the remaining unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap if we found a smaller element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
