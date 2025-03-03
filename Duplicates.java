import java.util.Arrays;

public class Duplicates
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 2, 7, 8, 8, 3};

        System.out.println("array " + Arrays.toString(array));

        findDuplicates(array);
    }

    public static void findDuplicates(int[] array)
    {
        Arrays.sort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++)
        {
            if (array[i] == array[i + 1])
            {
                System.out.println("Duplicate : " + array[i]);
            }
        }
    }
}
