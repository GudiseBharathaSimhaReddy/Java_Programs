import java.util.Scanner;
class Scenario2 {
    public static void main(String args[]) {
        int s[][][] = new int[5][4][3];
        Scanner sc = new Scanner(System.in);
        int i, j, k;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 4; j++)
            {
                for (k = 0; k < 3; k++) {
                    s[i][j][k] = (int)(Math.random()*100);
                }
            }
            System.out.println();


        }
        for (i = 0; i <s.length; i++) {
            for (j = 0; j <s[i].length; j++)
            {
                for (k =0; k<s[i][j].length; k++) {
                    int sum=0;
                    for(int l=0;l<s[i].length;l++)
                    {
                        sum=sum+s[i][l][k];
                    }
                    double avg=sum/(double) s[i].length;
                    System.out.println(" student avg"+(j+1)+" "+avg);

                }
            }
            System.out.println();


        }


    }
}