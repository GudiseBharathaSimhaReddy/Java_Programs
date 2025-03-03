import java.util.Scanner;

public class Arraysort
{
    public static void main(String[] args)
    {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            a[i]= sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            if(a[i]%2!=0)
            System.out.println(a[i]);
        }
    }
}
