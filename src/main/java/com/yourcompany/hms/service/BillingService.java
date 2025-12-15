package com.yourcompany.hms.service;

import com.yourcompany.hms.model.Bill;
import com.yourcompany.hms.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingService {

    @Autowired
    private BillRepository billRepository;

    public List<Bill> getAllBills() {
        return billRepository.findAll();
    }

    public void createBill(Bill bill) {
        billRepository.save(bill);
    }
}
