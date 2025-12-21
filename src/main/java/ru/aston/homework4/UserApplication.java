package ru.aston.homework4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {
        "ru.aston.homework2.entities"
})
public class UserApplication {

    public static void main(String... args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
