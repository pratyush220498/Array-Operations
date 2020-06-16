/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayTraversal;

/**
 *
 * @author pratyush
 */
public class Traversal {
    public static void traverse(int[] arr,int count)
    {
        if(count==0)
            System.out.println("no element to disaplay.");
        else
        {
            for(int i=0;i<count;i++)
            {   
                System.out.print(i+" ");
            }
             System.out.println();
        }
    }
}
