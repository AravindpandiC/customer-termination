package com.example.customertermination.repository;

import com.example.customertermination.entity.CustomerTermination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerTerminationRepository extends JpaRepository<CustomerTermination,Integer> {
}
