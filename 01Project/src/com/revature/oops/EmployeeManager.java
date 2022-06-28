public class EmployeeManager {
    public static void main(String[] args) {
        //Employee emp=new Employee();
    	SalariedEmployee se=new SalariedEmployee(101, "Jam", 21);
    	double salSE=se.calculateSalary(se.getDaysPresent());
    	System.out.println("ID : "+ se.getId(), " Name: " +se.getName(), " Days Present : ", +se.getDaysPresent(), " Salary : " + salSE);
    	
    	// To Do for CE
    }
   
}