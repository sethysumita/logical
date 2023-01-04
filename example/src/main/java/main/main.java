package main;

import config.AppConfig;
import controller.LoginController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.xml.namespace.QName;
import java.time.Clock;

public class main {
    public static void main(String args[]) {


        var context = new AnnotationConfigApplicationContext(AppConfig.class);
       LoginController c1=context.getBean("loginController1",LoginController.class);
       LoginController c2=context.getBean("loginController2",LoginController.class);
       System.out.println( c1);
        System.out.println(c2);
    }
}
