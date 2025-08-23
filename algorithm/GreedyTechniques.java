package com.algorithm;




import java.util.*;

class GreedyTechniques {
    static void maxActivities(int[] start, int[] end) {
        int n = start.length;
        
        // Sort activities by end time
        int[][] activities = new int[n][2];
        for (int i = 0; i < n; i++) {
            activities[i][0] = start[i];
            activities[i][1] = end[i];
        }
        Arrays.sort(activities, Comparator.comparingInt(a -> a[1]));
        
        // First activity always selected
        int count = 1;
        int lastEnd = activities[0][1];
        
        for (int i = 1; i < n; i++) {
            if (activities[i][0] >= lastEnd) {
                count++;
                lastEnd = activities[i][1];
            }
        }
        
        System.out.println("Max activities: " + count);
    }

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end   = {2, 4, 6, 7, 9, 9};
        maxActivities(start, end);
    }
}

