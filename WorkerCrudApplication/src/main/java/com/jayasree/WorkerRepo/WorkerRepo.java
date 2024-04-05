package com.jayasree.WorkerRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jayasree.model.WorkerDetails;

@Repository
public interface WorkerRepo extends JpaRepository<WorkerDetails, Integer> {

} 
