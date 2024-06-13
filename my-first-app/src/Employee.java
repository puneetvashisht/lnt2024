public class Employee {
    
    // Fields/Properties/State
    int id;
    String name;
    double salary;
    // has-a relationship
    Address address;

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Employee(){
        
    }
    public Employee(int id, String name, double s){
        super();
        this.id = id;
        this.name = name;
        salary = s;
    }

    public Employee(int id, String name, double s, Address address){
        // this.id = id;
        // this.name = name;
        // salary = s;
        this(id, name, s);
        this.address = address;
    }

    // methods/behaviour/funcitons
    void incrementSalary(){
        this.salary = this.salary * 1.1;
    }

    

    //  public String toString(){
    //     return "ID: "+ this.id + " Salary " + this.salary;
    // }


    // public String toString() {
    //     return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    // }



    public static void main(String[] args) {
        Address address = new Address(23, "South Ex", "Delhi", 110012);
        Employee emp1 = new Employee(23, "Ravi", 34344.34);
        emp1.setAddress(address);
        // emp1.id = 23;
        // emp1.name = "Ravi";
        // emp1.salary = 34344.34;
        
        Employee emp2 = new Employee();
        emp2.id = 22;
        emp2.name = "Priya";
        emp2.salary = 44344.34;

        System.out.println(emp1);
        emp1.incrementSalary();
        System.out.println(emp1);

        System.out.println(emp1.toString());
        System.out.println(emp2);

       
        Employee employee = new Employee(23, "Jhanvi",33434.34, address);
        System.out.println(employee);

    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
    }
}
