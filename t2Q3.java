import java.util.Scanner;
public class t2Q3 {
    public static void main(String args[])
    {
        int s=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array =");
        s=sc.nextInt();
        int a[]=new int[s];
        for(int i=0;i<s;i++)
        {
            a[i]=sc.nextInt();
        }
        int x=0,l=0;
       for(int i=0;i<s;i++) 
       {
            if(a[i]%2!=0)
            {
                int t=a[i];
                a[i]=a[x];
                a[x]=t;
                x++;
            }
       }
        for(int j=0;j<x;j++)
       {

           for(int k=0;k<x;k++)
           {
              if(a[j]<a[k])
              {
               int t=a[j];
               a[j]=a[k];
               a[k]=t;
              }
           }
       } 
       for(int i=0;i<s;i++)
       {
           if(a[i]%2==0)
           {
                for(int j=i;j<s;j++)
                {
                    for(int k=i;k<s;k++)
                    {
                       if(a[j]>a[k])
                       {
                        int t=a[j];
                        a[j]=a[k];
                        a[k]=t;
                       }
                    }
                }
           }
       }
       System.out.println("after conversion -");
       for(int i=0;i<s;i++)
       {
           System.out.print(a[i]+"\t");
       }
    }
}
