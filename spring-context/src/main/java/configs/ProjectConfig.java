package configs;

import beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "beans")
@PropertySource(value = "classpath:application.properties")
public class ProjectConfig {

//    @Bean
//    public Student  student(){
//        return new Student("sagar",31);
//    }
}
