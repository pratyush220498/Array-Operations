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
public class ShellSort {

public static void shellSort(int[] ar)
{
    int len=ar.length;
    int gap=len/2;
    while(gap>0)
    {
        for(int i=gap;i<len;i++)
        {
            int temp=ar[i];
            int j=i;
            while(j>=gap&&ar[j-gap]>temp)
            {
                ar[j]=ar[j-gap];
                j=j-gap;
            }
            ar[j]=temp;
        }
        gap=gap/2;
    }
}
}
