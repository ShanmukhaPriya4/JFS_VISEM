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
        int n=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int next=a+b;
            a=b;
            b=next;
        }
    }
}
