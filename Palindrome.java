//palindrome
public class Palindrome {
    public static void main(String[] args){
        String a="REFER";
        char b[]=a.toCharArray();
        int s=b.length;
        char c[]=new char[s];
        int i=0;
        while(i!=s)
        {

            c[s-i-1] = b[i];
            i++;

        }
        while(i!=s){
            if(b[i]!=c[i])
            {
                System.out.println("not a palindrome");
            }
            else
            {
                i++;
                continue;

            }

        }
        System.out.println("palindrome");


        System.out.println(b);
        System.out.println(c);



    }

}