package designpatterns.builder;

public class Employee {
    private String name;
    private String id;
    private String salary;

    private Employee(String name, String id, String salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public static EmployeeBulder builder(){
        return new EmployeeBulder();
    }

    public static class EmployeeBulder{
        private String name;
        private String id;
        private String salary;

        public EmployeeBulder(){

        }
        
        public EmployeeBulder name(String name){
            this.name = name;
            return this;
        }

        public EmployeeBulder id(String id){
            this.id = id;
            return this;
        }

        public EmployeeBulder salary(String salary){
            this.salary = salary;
            return this;
        }

        public Employee build(){
            return new Employee(name, id, salary);
        }

    }

    @Override
    public String toString() {
        return String.format("Employee [name=%s, id=%s, salary=%s]", name, id, salary);
    }

    
    
}
