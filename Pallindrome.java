/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pallindrome;
import java.util.*;
/**
 *
 * @author WIN8.1
 */
public class Pallindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str2=str;
        StringBuffer str3=new StringBuffer(str2);
        str3.reverse();
        if(str3.toString().equals(str))
        {
            System.out.println("string is pallindrome");
        }
        else {
            System.out.println("string is not pallindrome");
        }
    }
    
}
