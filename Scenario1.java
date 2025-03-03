import java.util.Scanner;
public class Scenario1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][][]=new int[5][2][5];
        int temp=-1;
        int i=0,j=0,k=0;
        for(i=0;i<5;i++)
        {
            for(j=0;j<2;j++)
            {
                for(k=0;k<5;k++)
                {
                    a[i][j][k]= (int)(Math.random()*100);
                }
            }
            System.out.println();
        }
        for(i=0;i<5;i++)
        {
            for(j=0;j<2;j++)
            {
                for(k=0;k<a[i][j].length;k++)
                {
                    if(a[i][j][k]>temp)
                    {
                        temp=a[i][j][k];

                    }

                }
            }
        }
        for(i=0;i<5;i++)
        {
            for(j=0;j<2;j++)
            {
                for(k=0;k<a[i][j].length;k++)
                {
                    System.out.print(a[i][j][k]+"  ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Address: "+i+" "+j+" "+k);
        System.out.println("highest percentage:"+temp);
    }
}