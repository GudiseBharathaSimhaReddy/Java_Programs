import java.util.ArrayList;
import java.util.Scanner;
public class Employeenames
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> employeeNames = new ArrayList<>();
        System.out.print("Enter the number of employees: ");
        int numEmployees = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= numEmployees; i++)
        {
            System.out.print("Enter name of employee " + i + ": ");
            String name = sc.nextLine();
            employeeNames.add(name);
        }
        System.out.print("Enter the employee name to check: ");
        String searchName = sc.nextLine();
        if (employeeNames.contains(searchName))
        {
            System.out.println("exit");
        }
        else
        {
            System.out.println("Employee not found.");
        }
        sc.close();
    }
}
