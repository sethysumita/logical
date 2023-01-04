package beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    //@Value("${student.name}")
    @Value("sagar")
    private String name;

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public Student() {
        System.out.println("default constructor");
    }

    public int getAge() {
        return age;
    }



//    public void setAge(int age) {
//        this.age = age;
//    }
   // @Value("${student.age}")
    @Value("3")
    private int age;
}
