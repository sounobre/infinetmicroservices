package com.dnobre.worker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dnobre.worker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
