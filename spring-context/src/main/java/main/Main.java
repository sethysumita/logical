package main;

import beans.College;
import beans.Student;
import configs.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        College college = context.getBean(College.class);
        System.out.println(college.getStudent().getName());
        System.out.println(college.getStudent().getAge());
        System.out.println(college.getName());
        System.out.println(college.getAdress());
    }
}
