package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.DECEMBER;


@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student marko = new Student(
                    "Marko",
                    "mail@mail.com",
                    LocalDate.of(1997, DECEMBER, 5)
            );

            Student alex = new Student(
                    "Alex",
                    "alexm@mail.com",
                    LocalDate.of(2001, DECEMBER, 5)
            );

            repository.saveAll(
                    List.of(marko, alex)
            );
        };
    }
}
