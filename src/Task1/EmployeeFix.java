package Task1;

public class EmployeeFix implements Salary{


private int salaryFix;


   public EmployeeFix (int salary){
        this.salaryFix=salary; }

    public int getSalaryFix() {
        return salaryFix;
    }

    public void setSalaryFix(int salaryFix) {
        this.salaryFix = salaryFix;
    }

    public void salary(int percent) {

      int salary2 = percent*getSalaryFix()+getSalaryFix();

        System.out.println("Зарплата фіксована = "+ salary2);
    }

    public void salary() {
        System.out.println("Фіксована зарплата ");
    }


}
