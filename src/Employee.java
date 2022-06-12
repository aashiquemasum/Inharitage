public class Employee extends Member {
    private String specialization;

    public Employee(String name, int age, String phoneNumber,
                    String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);

        this.specialization = specialization;
        System.out.println("Employee name:"+ name+ "\n " +"age:"+ age + " \n"+ "Phone number:"+phoneNumber+"\n" +"Address:"+address+"\n "+"Salary:"+salary);
    }

    }


