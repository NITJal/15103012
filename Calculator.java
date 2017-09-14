/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.*;
/**
 *
 * @author WIN8.1
 */
public class Calculator implements CalciInterface{

    /**
     * @param args the command line arguments
     */
    public int sum(int a,int b)
    {
  	  return a+b;
    }
    public int subtract(int a,int b)
    {
  	  return a-b;
    }
    public int divide(int a,int b)
    {
  		  return a/b;
    }
    public int multiply(int a,int b)
    {
  	  return a*b;
    }  
    public  int minimum(int a, int b){
    	return((a<b)?a:b);
    }
    public  int maximum(int a, int b){
    	return((a>b)?a:b);
    }
    public double cosine(double a){
      double c=Math.cos(a);
      return c;
    }
    public double sine(double a){
        double c=Math.sin(a);
        return c;
      }
      
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator obj=new Calculator();
        Scanner sc=new Scanner(System.in);
    	 while(true){
    	 System.out.print("1.add\n2.subtract\n3.multiply\n4.divide\n5.Maximum\n6.Minimum\n7.Cosine\n8.sine\n9.Exit\n");
    	 int n=sc.nextInt();
    	 int a,b;
    	 switch(n)
    	 {
    	 case 1:
    		 System.out.println("enter the numbers");
    		 a=sc.nextInt();
    		 b=sc.nextInt();
    		 System.out.println(obj.sum(a, b));break;
    	 case 2:
    		 System.out.println("enter the numbers");
    		 a=sc.nextInt();
    		 b=sc.nextInt();
    		 System.out.println(obj.subtract(a, b));break;
    	 case 3:
    		 System.out.println("enter the numbers");
    		 a=sc.nextInt();
    		 b=sc.nextInt();
    		 System.out.println(obj.multiply(a, b));break;
    	 case 4:
    		 System.out.println("enter the numbers");
    		 a=sc.nextInt();
    		 b=sc.nextInt();
    		 try{
    		 System.out.println(obj.divide(a, b));break;
    		 }
    		 catch(Exception e)
    		 {
    			 System.out.println("it gives infinity");
    		 }
    	 case 5: 
    		 System.out.println("enter the numbers");
    		 a=sc.nextInt();
    		 b=sc.nextInt();
    		 System.out.println(obj.maximum(a, b));break;
    	 case 6:
    		 System.out.println("enter the numbers");
    		 a=sc.nextInt();
    		 b=sc.nextInt();
    		 System.out.println(obj.minimum(a, b));break;
    	 case 7:
    		 System.out.println("enter the numbers");
    		 a=sc.nextInt();
    		 System.out.println(obj.cosine(a));break;
    	 case 8:
    		 System.out.println("enter the numbers");
    		 b=sc.nextInt();
    		 System.out.println(obj.sine(b));break;
    	 case 9:System.exit(0);
    	        break;
    	 default:
    		   break;
    	 }
      }
    }
    
}
