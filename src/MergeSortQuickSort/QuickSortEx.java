package MergeSortQuickSort;

import java.util.Scanner;

public class QuickSortEx {
    public static int partition(int start, int end, int arr[])
    {
        // PLACE smaller element of pivot TO LEFT SIDE

        int pivot = arr[end];
        int i = start;

        for(int j=start; j<=end-1; j++)
        {
            if(arr[j] < pivot)
            {
                // swap --> arr[j], arr[i]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
        }

        // i is the correct position of PIVOT element
        int temp = arr[end];
        arr[end] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void quickSort(int start, int end, int arr[])
    {
        if(start >= end)
        {
            return;
        }

        int i = partition(start, end, arr);

        quickSort(start, i-1, arr); // (0 --- k-1)
        quickSort(i+1, end, arr); // (k+1 --- end)
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
        quickSort(0,n-1,arr);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
