import java.util.Scanner;
public class Jagged {
    public static void main(String args[])
    {
        //jagged 2D ARRAY
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][];
        a[0]=new int[1];
        a[1]=new int[2];
        a[2]=new int[3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }

}