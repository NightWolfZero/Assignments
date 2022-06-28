public  abstract class Employee {
    private int id;
    private String name;

    public Employee() {
        super();
        System.out.println("Employee Constructor");
    }

    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
        System.out.println("Parameterized Constructor of Emp");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double calculateSalary(int worked) ;
}