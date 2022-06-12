public class Manager extends Member {
    private String department;
    public String printName;


    public Manager(String name, int age, String phoneNumber,
                   String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
        System.out.println("Manager name:"+ name+ "\n " +"age:"+ age + " \n"+ "Phone number:"+phoneNumber+"\n" +"Address:"+address+"\n "+"Salary:"+salary);

    }
        public static void main (String[]args){
            Employee employee = new Employee("Tom", 25, "555-555-55", "Home", 25631.5, "IT");
            Manager manager = new Manager("Ron", 30, "555-617-55", "Earth", 69586.5, "IT");
            employee.printSalary();
            manager.printSalary();
        }
    }

