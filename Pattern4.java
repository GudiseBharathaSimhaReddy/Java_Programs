import java.sql.SQLOutput;
import java.util.Scanner;

public class Pattern4
{
    public static void main(String[] args)
    {
        for(int i=1;i<6;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("_");
            }
            System.out.println("*****");
        }
        System.out.println();
    }
}
