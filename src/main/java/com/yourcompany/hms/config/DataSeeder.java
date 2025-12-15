package com.yourcompany.hms.config;

import com.yourcompany.hms.model.User;
import com.yourcompany.hms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        if (userRepository.count() == 0) {
            User admin = new User();
            admin.setUsername("admin");
            admin.setPassword(passwordEncoder.encode("admin"));
            admin.setRoles("ROLE_ADMIN");
            admin.setActive(true);
            userRepository.save(admin);

            User doctor = new User();
            doctor.setUsername("doctor");
            doctor.setPassword(passwordEncoder.encode("doctor"));
            doctor.setRoles("ROLE_DOCTOR");
            doctor.setActive(true);
            userRepository.save(doctor);

            User patient = new User();
            patient.setUsername("patient");
            patient.setPassword(passwordEncoder.encode("patient"));
            patient.setRoles("ROLE_PATIENT");
            patient.setActive(true);
            userRepository.save(patient);

            System.out.println("Default users created: admin/admin, doctor/doctor, patient/patient");
        }
    }
}
