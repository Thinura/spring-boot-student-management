package com.amogoscode.springboottutorialamogoscode.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository) {
        return args -> {
            Student thinuraStudent = new Student(
                    "thinura",
                    "thinura@gmail.com",
                    LocalDate.of(1999, Month.JANUARY, 31)
            );

            Student laksaraStudent = new Student(
                    "laksara",
                    "laksara@gmail.com",
                    LocalDate.of(1994, Month.FEBRUARY, 3)
            );

            studentRepository.saveAll(List.of(thinuraStudent, laksaraStudent));
        };
    }
}
