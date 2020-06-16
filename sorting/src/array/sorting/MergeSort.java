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
public class MergeSort {
public static void mergeSort(int[] a,int f,int l)
{
    if(f<l)
    {
        int mid=(f+l)/2;
        mergeSort(a,f,mid);
        mergeSort(a,mid+1,l);
        merge(a,f,mid,l);
    }
}
public static void merge(int[] a,int f,int mid,int l)
{
    int n1=mid-f+1;
    int[] left=new int[n1+1];    
    int n2=l-mid;
    int[] right=new int[n2+1];
    int i,j;
    int temp=f;
    for(i=0;i<n1;i++)
    {
        left[i]=a[temp];
        temp++;
    }
    left[i]=10000;
    temp=mid+1;
    for(j=0;j<n2;j++)
    {
        right[j]=a[temp];
        temp++;
    }
    right[j]=10000;
    i=0;
    j=0;
    for(int k=f;k<=l;k++)
    {
        if(left[i]<=right[j])
        {
            a[k]=left[i];
            i++;
        }
        else
        {
            a[k]=right[j];
            j++;
        }
    }
}
}
