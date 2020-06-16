/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayDeletion;

import java.io.BufferedReader;

/**
 *
 * @author pratyush
 */
public class Deletion {
    public static int deleteElement(int[] arr,BufferedReader br,int count)throws Exception
    {
                System.out.println("Your options are :-");
                System.out.println("1.Deletion at first");
                System.out.println("1.Deletion at last");
                System.out.println("1.Deletion at specific position");
                System.out.println("1.Deletion at specific element");
                System.out.println("Please enter your option :-");
                int option=Integer.parseInt(br.readLine());
                switch(option)
                {
                    case 1:
                        if(count==0)
                        {
                                  System.out.println("Array underflow");
                        }
                        else
                        {
                            for(int i=0;i<count-1;i++)
                            {
                                arr[i]=arr[i+1];
                            }
                            count--;
                        }
                        break;
                    case 2:
                        if(0==count)
                            System.out.println("Array underflow");
                        else
                        {
                            arr[count-1]=0;
                            count--;
                        }
                        break;
                    case 3:
                        System.out.println("Enter the position :- ");
                        int pos=Integer.parseInt(br.readLine());
                        if(0==count)
                            System.out.println("Array underflow");
                        else if(arr[pos-1]==0)
                        {
                            System.out.println("no element to delete");
                        }
                        else if(pos<=0&&pos>=arr.length)
                        {
                            System.out.println("Wrong position");
                        }
                        else
                        {
                            for(int i=pos-1;i<count-1;i++)
                            {
                                arr[i]=arr[i+1];
                            }
                            count--;
                        }    
                        break;
                    case 4:
                        
                        System.out.println("Enter element to delete :- ");
                        int item=Integer.parseInt(br.readLine());
                        int pos1=0;
                        for(int i=0;i<count;i++)
                        {
                            if(arr[i]==item)
                            {
                                pos1=i;
                                break;
                            }    
                        }
                        for(int i=pos1;i<count-1;i++)
                            {
                                arr[i]=arr[i+1];
                            }
                            count--;
                        break;        
                    default:
                        System.out.println("you have enetered wrong choice.");
                                
                }
                return count;
    }
}
