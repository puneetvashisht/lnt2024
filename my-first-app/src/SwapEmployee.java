public class SwapEmployee {

  // create a method swap(Emp1, emp2) ... 

   public static void main(String[] args) {
    Employee emp1 = new Employee(1, "Ravi", 34344.34);
    Employee emp2 = new Employee(2, "Swathi", 14344.34);

    Employee temp = emp1;

    
    // int score[];
    Employee employees[] = {emp1, emp2};
    // System.out.println(employees[0]);
    for(Employee e : employees){
        e.incrementSalary();
        System.out.println(e);
    }
        
   } 
}
