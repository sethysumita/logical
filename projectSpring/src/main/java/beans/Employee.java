package beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Value("sumita")
    private String empName;
    @Value("123")
    private int empId;
    public Employee(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }

    public Employee() {
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpId() {
        return empId;
    }
}
