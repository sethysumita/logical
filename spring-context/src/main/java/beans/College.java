package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {


    private Student student;
    @Value("${college.name}")
    private String name;
    @Value("${college.address}")
    private String adress;



    public College(Student student, String name, String adress) {
        this.student = student;
        this.name = name;
        this.adress = adress;
    }
    public Student getStudent() {

        return student;
    }
    public String getName() {
        return name;
    }

    public String getAdress() {

        return adress;
    }

    @Autowired
    public College(Student student) {

        this.student = student;
    }
//    public void setStudent(Student student) {
//        this.student = student;
//    }


    //@Autowired
//    public College(Student student) {
//        this.student = student;
//    }
}
