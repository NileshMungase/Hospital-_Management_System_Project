package com.yourcompany.hms.service;

import com.yourcompany.hms.model.Prescription;
import com.yourcompany.hms.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrescriptionService {

    @Autowired
    private PrescriptionRepository prescriptionRepository;

    public List<Prescription> getAllPrescriptions() {
        return prescriptionRepository.findAll();
    }

    public void savePrescription(Prescription prescription) {
        prescriptionRepository.save(prescription);
    }
}
