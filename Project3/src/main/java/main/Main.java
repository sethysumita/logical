package main;

import config.AppConfig;
import controllers.ProductController;
import jdk.dynalink.beans.StaticClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static  void main(String args[]){
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.getBean(ProductController.class);
    }
}
