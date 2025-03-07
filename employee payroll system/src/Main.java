import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        creates an object of the PayrollSystem class and assigns it to the variable payrollSystem.
        Payroll payroll = new Payroll();

        while (true){
            System.out.println("\nPayroll Management System");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Display Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter Name: ");
                    String ftName = scan.nextLine();
                    System.out.print("Enter ID: ");
                    int ftId = scan.nextInt();
                    System.out.print("Enter Monthly Salary: ");
                    double salary = scan.nextDouble();
                    payroll.addemployee(new FullTimeEmployee(ftName,ftId,salary));
//                    creates a new Full-Time Employee object and adds it to the payroll
                    break;
                case 2:
                    System.out.print("Enter Name: ");
                    String ptName = scan.nextLine();
                    System.out.print("Enter ID: ");
                    int ptId = scan.nextInt();
                    System.out.print("Enter Hours Worked: ");
                    int hours = scan.nextInt();
                    System.out.print("Enter Hourly Rate: ");
                    double rate = scan.nextDouble();
                    payroll.addemployee(new PartTimeEmployee(ptName,ptId,hours,rate));
                    break;
                case 3:
                    System.out.print("Enter Employee ID to remove: ");
                    int removeID = scan.nextInt();
                    payroll.removeemployee(removeID);
                    break;
                case 4:
                    payroll.displayemployee();
                    break;
                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    scan.close();
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}