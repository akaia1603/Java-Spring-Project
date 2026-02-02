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
            // in ra tất cả beans java quản lý, quản lý các container, là thực thể do spring
            // quản lý
            System.out.println(s);
            ;
        }

    }

}