package designpatterns.builder;

public class App {
    public static void main(String[] args) {
        Employee emp1 = Employee.builder()
                        .id("1")
                        .name("Nilesh")
                        .salary("1234567")
                        .build();

        System.out.println(emp1);
    }

    
}
