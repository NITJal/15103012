/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime_number;
import java.util.*;
/**
 *
 * @author WIN8.1
 */
public class Prime_number {

    /**
     * @param args the command line arguments
     */
    public boolean checkprime(int n)
    {
        if(n==1||n==2)return true;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Prime_number obj=new Prime_number();
        System.out.println("enter a number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(obj.checkprime(i))
            {
                System.out.println(i);
            }
        }
    }
    
}
