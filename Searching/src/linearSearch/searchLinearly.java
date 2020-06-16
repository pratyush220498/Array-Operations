/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearSearch;

/**
 *
 * @author pratyush
 */
public class searchLinearly {
    public static void search(int[] arr,int item)
    {
        int count=0;
        for(int i : arr)
        {
            if(i==item)
            {
                System.out.println("item found "+i+" item found at index "+count+" and position "+(count+1));
                return;
            }
            count++;
        }
        System.out.println("item not found");
    }
}
