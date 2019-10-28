package Task1;

public class MainSalary {

    public static void main(String[] args) {

        EmployeeFix employeeFix = new EmployeeFix(10000);
        EmployeeHour employeeHour = new EmployeeHour(100);

        System.out.println(employeeFix.getSalaryFix());
employeeFix.setSalaryFix(20000);
employeeFix.salary();
employeeFix.salary(20);

System.out.println("=============================");

        System.out.println(employeeHour.getSalaryHour());
        employeeHour.salary();
        employeeHour.salary(22,8);

        employeeHour.setSalaryHour(200);
        System.out.println(employeeHour.getSalaryHour());
        employeeHour.salary();
          employeeHour.salary(22,8);




          }
}
