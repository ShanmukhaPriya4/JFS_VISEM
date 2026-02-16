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
        if(n<=1) System.out.println("not a prime number");
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime) System.out.println("Prime Number");
        else System.out.println("Its not an prime number");

    }
}
