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
public class BubbleSort {

public static void bubbleSort(int[] ar)
{
    for(int i=0;i<=ar.length-2;i++)
    {
        for(int j=0;j<=ar.length-i-2;j++)
        {
            if(ar[j]>ar[j+1])
            {
                int temp=ar[j];
                ar[j]=ar[j+1];
                ar[j+1]=temp;
            }
        }
    }
}
}
