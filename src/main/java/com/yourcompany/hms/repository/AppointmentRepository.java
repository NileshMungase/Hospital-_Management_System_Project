package com.yourcompany.hms.repository;

import com.yourcompany.hms.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.yourcompany.hms.model.Doctor;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByDoctor(Doctor doctor);
}
