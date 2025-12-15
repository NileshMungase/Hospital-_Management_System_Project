package com.yourcompany.hms.repository;

import com.yourcompany.hms.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {
}
