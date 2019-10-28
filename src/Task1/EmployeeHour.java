package Task1;

public class EmployeeHour implements Salary{


    private int salaryHour;

    EmployeeHour (int salary){

        this.salaryHour = salary; }

    public int getSalaryHour() {
        return salaryHour;
    }

    public void setSalaryHour(int salaryHour) {
        this.salaryHour = salaryHour;
    }

    public void salary() {
        System.out.println("Зарплата за годину ");
    }

    public void salary(int days, int hours) {

        int salary2 = days*hours*getSalaryHour();

        System.out.println("Зарплата за годину = " + salary2);
    }





    }

