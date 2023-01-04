package main;

import beans.College;
import beans.Employee;
import config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//   Employee employee  =    context.getBean(Employee.class);
//        System.out.println(employee.getEmpName());
        College college = context.getBean(College.class);
        System.out.println(college.getCollegeName());
        System.out.println(college.getCollegeId());
        System.out.println(college.getEmployee().getEmpId());
        System.out.println(college.getEmployee().getEmpName());
    }
}
