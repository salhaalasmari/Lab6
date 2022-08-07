public class Employee {
    private int id , salary;
    private String firstName , lastName;

    public Employee(int id, int salary, String firstName, String lastName) {
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        if (salary <0)
            this.salary=0;
        else
        this.salary = salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void getName(){
        System.out.println("Your full name is :"+firstName+" "+lastName);
    }
    public  int  getAnnualSalary(){
        return salary *12;

    }
    public int raisSalary(int percent){
        return salary*percent/100;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
