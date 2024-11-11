package MergeSortQuickSort;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSortEx {

    public static void merge(int arr[], int start, int mid, int end)
    {
        ArrayList<Integer> sortedMerge = new ArrayList<>();

        // FIRST PART (start -- mid)
        int i = start;

        // SECOND PART (mid+1 -- end)
        int j = mid+1;

        while(i <= mid && j <= end)
        {
            if(arr[i] <= arr[j])
            {
                sortedMerge.add(arr[i]);
                i++;
            }
            else
            {
                sortedMerge.add(arr[j]);
                j++;
            }
        }

        while(i <= mid)
        {
            sortedMerge.add(arr[i]);
            i++;
        }

        while(j <= end)
        {
            sortedMerge.add(arr[j]);
            j++;
        }

        int index = 0;
        // COPY elements from ARRAYLIST to ARRAY
        for(int k=start; k<=end; k++)
        {
            arr[k] = sortedMerge.get(index);
            index++;
        }
    }

    // divide
    public static void mergeSort(int start, int end, int arr[])
    {
        // base case
        if(start >= end)
        {
            // there is only one element
            return;
        }

        // recursive case
        int mid = (start + end)/2;

        mergeSort(start, mid, arr); // first half of the array --> (st -- mid)
        mergeSort(mid+1, end, arr); // second half of the array --> (mid+1 -- en)

        // merge first & second half of the array
        merge(arr, start, mid, end); // --> O(N)
    }

    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }

        // O(N log N)
        mergeSort(0,n-1,arr);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
