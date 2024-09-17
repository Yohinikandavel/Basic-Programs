import java.util.*;

public class Typecasting {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] n = new int[4];
        System.out.println("Enter the digits:");
        for(int i=0;i<4;i++)
        {
            n[i]=sc.nextInt();
        }
        System.out.println("Output:");
        for(int i=0;i<4;i++)
        {
            System.out.println((char)(n[i]));
        }
    }
}

/* without array we can also directly use typecasting as below:
     int a= sc.nextInt();
     int b = sc.nextInt();
     System.out.println(a+"-"+(char)a);
     System.out.println(b+"-"+(char)b); 
Depending on the given question */
