/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.sorting;

/**
 *
 * @author pratyush
 */
public class InsertionSort {

    public static void insertionSort(int[] ar)
    {
        for(int i=1;i<ar.length;i++)
        {
            int temp=ar[i];
            int j;
            for(j=i-1;j>=0&&ar[j]>temp;j--)
            {
                ar[j+1]=ar[j];
            }
            ar[j+1]=temp;
        }
    }
}
