import java.util.Scanner;
public class Out {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][][]=new int[3][2][2];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                for(int k=0;k<2;k++)
                {
                    a[i][j][k]=sc.nextInt();
                }

            }

        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                for(int k=0;k<2;k++)
                {
                    System.out.print(a[i][j][k]+"  ");
                }

            }
            System.out.println("");
        }

    }

}