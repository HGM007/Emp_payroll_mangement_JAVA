import java.util.*;

public class Payroll {
    private List<employee> employeeList = new ArrayList<>();

//    public Payroll(){
//        employeeList=new ArrayList<>();
//    emp is an instance of the employee class or subclass
    public void addemployee(employee emp){
        employeeList.add(emp);
        System.out.println("Employee added successfully");
    }
    public void removeemployee(int id){
//        declare var that can store reference to employee obj
        employee emptoremove = null;
//        employee is type of obj store in employeelist that's why we use it in for each loop instead of primetive data type
        for (employee emp : employeeList){
            if (emp.getId() == id){
                emptoremove = emp;
                break;
            }
        }
        if (emptoremove!=null){
            employeeList.remove(emptoremove);
            System.out.println("Employee removed successfully!");
        } else {
            System.out.println("Employee not found!");
        }
    }
    public void displayemployee(){
        if (employeeList.isEmpty()){
            System.out.println("no employee to display");
        }else {
            for (employee emp : employeeList){
                System.out.println(emp);
            }
        }
    }
}