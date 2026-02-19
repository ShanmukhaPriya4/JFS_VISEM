package com.skillnext;

/**
 * Hello world!
 *
 */
import java.util.*;
public class Palindrome
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int rev = 0;
        int temp = a;
        while(a > 0){
            int d = a%10;
            a = a/10;
            rev = rev*10 + d;
        }
        System.out.println("Reverse of number is :"+rev);
        if(rev == temp){
            System.out.println("The number is a palindrome");
        }
        else {
            System.out.println("The number is not a palindorme");
        }
    }
}
