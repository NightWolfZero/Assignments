public class ContractEmployee extends Employee{
    private int hoursWorked;

    public ContractEmployee() {
        super();
    }

    public ContractEmployee(int hoursWorked) {
        super();
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary(int worked) {
        // TODO Auto-generated method stub
        return 10.66*worked;
    }
    
    
}