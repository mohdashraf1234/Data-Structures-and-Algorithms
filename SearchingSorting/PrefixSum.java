package Searchingu.Sorting;

public class PrefixSum {
    public static void main(String[] args) {
        int arr[] = {2, 9, 3, 0, 8, 3, 3, 2, 9, 1};
        int l = 1;
        int r = 4;

        // Brute force sum
        int ans = 0;
        for (int i = l; i <= r; i++) {
            ans += arr[i];
        }
        System.out.println(ans);

        int n = 10;
        
        // Print original array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Prefix sum array
        int sum[] = new int[n];
        sum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + arr[i];
        }

        // Print prefix array
        for (int i = 0; i < n; i++) {
            System.out.print(sum[i] + " ");
        }
        System.out.println();

        // Range sum using prefix
        if (l == 0) {
            System.out.println(sum[r]);
        } else {
            System.out.println(sum[r] - sum[l - 1]);
        }
        //https://www.youtube.com/watch?v=Y_VmOJo1eKc
    }
}
