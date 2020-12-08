package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.FeeLog;

public interface FeeLogRepo extends JpaRepository<FeeLog, Integer>{

}
