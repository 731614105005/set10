# set10
import java.io.*;
 import java.util.*;
 public class Digits
 {
   public static void main(String args[])throws IOException
   {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
     int a=0;
     while(n>0)
     {
        n=n/10;
       a++;
        }
        System.out.println(a);
       }
     
       }
       
