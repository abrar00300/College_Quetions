#include<iostream>
using namespace std;
int main()
{
    int a[5][5],i,j;
    for(i=0;i<5;i++)
    {
            for(j=0;j<5;j++)
                    cin>>a[i][j];
    }
    for(i=0;i<5;i++)
    {
            for(j=0;j<5;j++)
                    cout<<a[i][j]<<" ";
                cout<<endl;
    }
    i=0;
    int sum;
    for(i=0;i<3;i++){
    for(int k=0;k<3;k++)
    {
        sum=a[i][k]+a[i][k+1]+a[i][k+2]+a[i+1][k+1]+a[i+2][k]+a[i+2][k+1]+a[i+2][k+2];
        cout<<a[i][k]<<" "<<a[i][k+1]<<" "<<a[i][k+2]<<endl<<" "<<a[i+1][k+1]<<endl<<a[i+2][k]<<" "<<a[i+2][k+1]<<" "<<a[i+2][k+2]<<"\nsum="<<sum<<"\n\n";
    }
    }
    return 0;
}
