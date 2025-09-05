package Searchingu.Sorting;

class QuickSortMiddle {

    public static void main(String[] args) {
        int[] arr = {15, 9, 7, 13, 12, 16, 4, 18, 11};
        int len = arr.length;

        QuickSortMiddle qsm = new QuickSortMiddle();
        qsm.quickSortRecursion(arr, 0, len - 1);

        System.out.println("Sorted Array:");
        qsm.printArray(arr);
    }

    int partition(int[] arr, int low, int high) {
        int pivot = arr[low];

        while (low <= high) {
            while (arr[low] < pivot) {
                low++;
            }
            while (arr[high] > pivot) {
                high--;
            }
            if (low <= high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }

    void quickSortRecursion(int[] arr, int low, int high) {
        int pi = partition(arr, low, high);
        if (low < pi - 1) {
            quickSortRecursion(arr, low, pi - 1);
        }
        if (pi < high) {
            quickSortRecursion(arr, pi, high);
        }
    }

    void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    //https://www.youtube.com/watch?v=l-YVzkQMLKg
}
