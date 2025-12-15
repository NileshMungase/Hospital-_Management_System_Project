package com.yourcompany.hms.service;

import com.yourcompany.hms.model.Appointment;
import com.yourcompany.hms.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    public void scheduleAppointment(Appointment appointment) {
        appointmentRepository.save(appointment);
    }
}
