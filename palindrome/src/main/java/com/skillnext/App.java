package com.skillnext;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter string: ");
        String s=sc.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        if(rev.equals(s)) System.out.print("Its a plaindrome");
        else System.out.print("Its not a  plaindrome");
    }
}
