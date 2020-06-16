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
public class CountSort {
 public static void sort(int[] ar)
 {
     int max=0;
     for(int i=0;i<ar.length;i++)
     {
         if(ar[i]>max)
             max=i;
     }
     int[] op=new int[ar.length];
     int[] count=new int[max+1];
     for(int i=0;i<ar.length;i++)
     {
         count[ar[i]]++;
     }
     for(int i=1;i<=max;i++)
     {
         count[i]=count[i]+count[i-1];
     }
     for(int i=ar.length-1;i>=0;i--)
     {
         op[--count[ar[i]]]=ar[i];
     }
 }
}