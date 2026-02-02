package vn.hoidanit.laptopshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class laptopshopApplication {

    public static void main(String[] args) {

        // lấy ra biến
        ApplicationContext hoidanit = SpringApplication.run(laptopshopApplication.class, args);
        for (String s : hoidanit.getBeanDefinitionNames()) {
            System.out.println(s);
            ;
        }

    }

}