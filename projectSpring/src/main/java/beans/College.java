package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
    @Value("abcdfgh")
    private  String collegeName;
    @Value("56")
    private int collegeId;

   private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public String getCollegeName() {

        return collegeName;
    }

    public int getCollegeId() {
        return collegeId;
    }
@Autowired
    public College(Employee employee) {
        this.employee= employee;
    }

    public College(String collegeName, int collegeId, Employee employee) {
        this.collegeName = collegeName;
        this.collegeId = collegeId;
        this.employee = employee;
    }
    //    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }
}
