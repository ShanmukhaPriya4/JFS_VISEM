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
        String s=sc.nextLine();
        String rev=new StringBuilder(s).reverse().toString();
        System.out.println(rev);

    }
}
