import java.lang.reflect.Array;
import java.util.Scanner;
public class t2Q2 {
    public static void main(String []args)
    {
        int n=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number = ");
        n=sc.nextInt();
        int temp=n,cnt=0;
        while(n>0)
        {
            n=n/10;
            cnt++;
        }
        int []a=new int[cnt];
        int x=0;
        n=temp;
        while(n>0)
        {
           a[x]=n%10;
           x++;
           n=n/10;
        }
        {
        for(int i=0;i<cnt;i++)
        {
            for(int j=0;j<cnt;j++)
            {
                if(a[i]<a[j])
                {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
    }
    int v=0;
       for(int q=0;q<cnt;q++)
       {
            v=v*10+a[q];
       }
       System.out.println("answere is "+v);
    }
}
