package com.example.demo;

import com.example.demo.model.EmploymentType;
import com.example.demo.model.Skill;
import com.example.demo.repository.EmploymentTypeRepository;
import com.example.demo.repository.SkillRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner dummyData(UserRepository userRepository, EmploymentTypeRepository employmentTypeRepository, SkillRepository skillRepository) {
        return args -> {
            skillRepository.save(Skill.builder().name("Software Development").build());
            skillRepository.save(Skill.builder().name("Software Tester").build());

            employmentTypeRepository.save(EmploymentType.builder().name("Permanent").build());
            employmentTypeRepository.save(EmploymentType.builder().name("Temporary").build());
        };
    }
}
