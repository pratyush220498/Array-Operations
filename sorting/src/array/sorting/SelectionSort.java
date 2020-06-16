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
public class SelectionSort {
    public static void selectionSort(int[] ar)
    {
        for(int i=0;i<=ar.length-2;i++)
        {
            int min=i;
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[j]<ar[min])
                    min=j;
            }
            if(i!=min)
            {
                int flag=ar[i];
                ar[i]=ar[min];
                ar[min]=flag;
            }
        }
    }
}
