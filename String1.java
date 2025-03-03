public class String1
{
    public static void main(String[] args)
    {
        String obj = new String("abc");
        String obj1 = new String("abcd");
        String s1 = "Hello";
        String s2 = "Hello";
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        {
            System.out.println(obj==obj1);
            System.out.println(s1 == s2);
            System.out.println(str1 == str2);
            System.out.println(str1.equals(str2));

        }

    }
}
