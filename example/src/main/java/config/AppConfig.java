package config;

import controller.LoginController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    LoginController loginController1(){
        return new LoginController();

    }
    @Bean
    LoginController loginController2(){
        return new LoginController();
    }
   @Bean
    String str(){
        return "hello";
    }
}
