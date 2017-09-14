/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortinglist;
import java.util.*;
/**
 *
 * @author WIN8.1
 */
public class Sortinglist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of strings:");
        int n=sc.nextInt();
        String m=sc.nextLine();
        String arr[]=new String[n];
        System.out.println("enter the strings");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i].compareTo(arr[j])>0)
                {
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("sorted order is: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    
}
