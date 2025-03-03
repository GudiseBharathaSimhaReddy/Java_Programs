import java.util.Scanner;
public class EmployeesinWorkshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCompanies = 3;
        int numEmployeesPerCompany;
        for (int i = 1; i <= numCompanies; i++) {
            System.out.print("Enter the number of employees from Company " + i + ": ");
            numEmployeesPerCompany = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the names of employees from Company " + i + ":");
            for (int j = 1; j <= numEmployeesPerCompany; j++) {
                System.out.print("Employee " + j + ": ");
                String employeeName = sc.nextLine();
                System.out.println("Employee " + j + " from Company " + i + ": " + employeeName);
            }
        }

        sc.close();
    }
}
