import java.util.Scanner;
public class t2Q4 {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        System.out.println("Enter your number = ");
        n=sc.nextInt();
        int temp=n,num=0,p=1;
        while(temp>0)
        {
            int d=temp%10;
            temp=temp/10;
            if(d%2==0)
            {
                d=1;
                num=num+d*p;
            }
            else
            {
                num=num+d*p;
            }
            p=p*10;
        }
        System.out.println("the number is = "+num);
    }
}
