package com.dnobre.worker.service;

import java.util.List;

import com.dnobre.worker.entities.Worker;
import com.dnobre.worker.form.WorkerForm.WorkerFormPost;

public interface WorkerService {

	List<Worker> findAll();
	Worker findById(Long id);
	Worker save(WorkerFormPost workerFormPost);
	Worker update(Worker worker);
	void delete(Long id);
}
