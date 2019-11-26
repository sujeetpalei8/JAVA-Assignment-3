public class Employee{
    private String name;
    private int age;
    private String dob;
    private String city;
    private long salary;
    
    public Employee(){
        
    }
    public Employee(String name, int age, String dob, String city, long salary){
        this.name=name;
        this.age=age;
        this.dob=dob;
        this.city=city;
        this.salary=salary;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setDob(String dob){
        this.dob=dob;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setSalary(long salary){
        this.salary=salary;
    }
    public void Display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(dob);
        System.out.println(city);
        System.out.println(salary);
    }
}
