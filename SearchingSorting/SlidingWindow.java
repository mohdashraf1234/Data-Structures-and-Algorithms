package Searchingu.Sorting;

class SlidingWindow {
	//Max sum sub array
	 public static int maxSum(int[] arr, int w) {
	       int n=arr.length;
	       int current=0;
	       //first window
	       for(int i=0; i<w; i++)
	       {
	    	   current =  current+arr[i];
	       }
	       //slide  window
	       int  maxx=current;
	       for(int i=1;  i<=n-w; i++)
	       {
	    	   current=current-arr[i-1]+arr[i+w-1];
	    	   if(current>maxx)
	    	   {
	    		   maxx=current;
	    	   }
	       }
	       return maxx;
	    }
	
    public static void main(String[] args) {
    	
    	int[] arr = {3, 8, 2, 5, 7, 6, 12};
        int w = 4;

        int result = maxSum(arr, w);
        System.out.println("Maximum sum of subarray of size " + w + " is: " + result);
        //https://www.youtube.com/watch?v=uqGxFk0cEdI
    }

}

