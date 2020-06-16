/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayinsertion;

import java.io.BufferedReader;

/**
 *
 * @author pratyush
 */
public class Insertion {

    public static int insertElement(int[] arr,BufferedReader br,int count)throws Exception
    {
        System.out.println("Enter element to insert :- ");
        int item=Integer.parseInt(br.readLine());
        System.out.println("Your options are :-");
                System.out.println("1.Insertion at first");
                System.out.println("1.Insertion at last");
                System.out.println("1.Insertion at specific position");
                System.out.println("Please enter your option :-");
                int option=Integer.parseInt(br.readLine());
                switch(option)
                {
                    case 1:
                        if(count==0)
                        {
                            arr[0]=item;
                            count++;
                        }
                        else if(arr.length==count)
                            System.out.println("Array overflow");
                        else
                        {
                            for(int i=count;i>=0;i--)
                            {
                                arr[i+1]=arr[i];
                            }
                            arr[0]=item;
                            count++;
                        }
                        break;
                    case 2:
                        if(arr.length==count)
                            System.out.println("Array overflow");
                        else if(count==arr.length-1)
                        {
                            arr[arr.length-1]=item;
                            count++;
                        }
                        else
                        {
                            arr[count]=item;
                            count++;
                        }
                        break;
                    case 3:
                        System.out.println("Enter the position :- ");
                        int pos=Integer.parseInt(br.readLine());
                        if(arr.length==count)
                            System.out.println("Array overflow");
                        else if(arr[pos-1]==0)
                        {
                            arr[pos-1]=item;
                            count++;
                        }
                        else
                        {
                            for(int i=count;i>=pos-1;i--)
                            {
                                arr[i+1]=arr[i];
                            }
                            arr[pos]=item;
                            count++;
                        }    
                        break;
                    default:
                        System.out.println("you have enetered wrong choice.");
                                
                }
                return count;
    }
}
