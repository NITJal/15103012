/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplymatrices;
import java.util.*;
/**
 *
 * @author WIN8.1
 */
public class MultiplyMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows and columns of first matrix:");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int matrix1[][]=new int[r1][c1];
        System.out.println("enter elements of first matrix:");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter number of rows and columns of second matrix");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        if(c1!=r2)
        {
            System.out.println("sorry!!matrices cannot be multiplied");
            System.exit(0);
        }
        int matrix2[][]=new int[r2][c2];
        System.out.println("enter elements of second matrix:");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                matrix2[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        int result[][]=new int[r1][c2];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                for(int k=0;k<r2;k++)
                {
                    sum=sum+matrix1[i][k]*matrix2[k][j];
                }
                result[i][j]=sum;
                sum=0;
            }
        }
        System.out.println("result of multiplication: ");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(result[i][j]+" ");
            }
        }
        System.out.println();
    }
    
}
