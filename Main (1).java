import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int c=0;
       while(a>1)
       {
           a=a/2;
           c++;
       }
       System.out.println("the cut is "+c);
        
    }
}