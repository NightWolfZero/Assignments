public class SalariedEmployee extends Employee{
    private int daysPresent;

    public SalariedEmployee() {
        super(); // call to the emp const...
        System.out.println("salaried Employee Default Constructor....");
    }

    public SalariedEmployee(int id, String name, int daysPresent) {
        super(id, name);
        this.daysPresent = daysPresent;
        System.out.println("Parameterized Constructor of SE");
    }

    public int getDaysPresent() {
        return daysPresent;
    }

    public void setDaysPresent(int daysPresent) {
        this.daysPresent = daysPresent;
    }

    @Override
    public double calculateSalary(int worked) {
        // TODO Auto-generated method stub
        return 1000.00*worked;
    }
    
    

}