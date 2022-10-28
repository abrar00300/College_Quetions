import java.util.Scanner;
public class t2Q1 {
    static int rev(int n)
    {
        int rev=0;
        while(n>0)
        {
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        return rev;
    }
    public static void main (String args[])
    {
        int i=0,max=0,temp=0,k=0;
        Scanner sc= new Scanner(System.in);
        for(i=1;i<=5;i++)
        {
            int a=0;
            a=sc.nextInt();
            temp=rev(a);
           // System.out.println(temp);
            int d=temp%10;
            if(d>max)
            {
                max=d;
                k=temp;
            }
        }
        System.out.println("the highest last digit  is "+max+" of "+k);
    }
}
