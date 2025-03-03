import java.util.Arrays;

public class Anagram {
    public static void main(String args[])
    {
        String s="LISTEN";
        String r="NESTIL";
        char b[]=s.toCharArray();
        char c[]=r.toCharArray();
        Arrays.sort(b);
        Arrays.sort(c);
        boolean res=Arrays.equals(b,c);
        if(res==true)
        {
            System.out.println("ANAGRAM");
        }
        else {
            System.out.println("NOT AN ANAGRAM");
        }



    }

}