package com.dnobre.worker.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.stereotype.Service;

import com.dnobre.worker.entities.Worker;
import com.dnobre.worker.form.WorkerForm;
import com.dnobre.worker.form.WorkerForm.WorkerFormPost;
import com.dnobre.worker.repositories.WorkerRepository;
import com.dnobre.worker.service.WorkerService;

@Service
public class WorkerServiceImpl implements WorkerService{
	
	@Autowired
	private WorkerRepository workerRepository;

	@Override
	public List<Worker> findAll() {
		
		return workerRepository.findAll();
	}

	@Override
	public Worker findById(Long id) {

		return workerRepository.findById(id).get();
	}

	@Override
	public Worker save(WorkerFormPost workerFormPost) {
		Worker worker  = new Worker();
		worker.setName(workerFormPost.getName());
		worker.setDailyIncome(workerFormPost.getDailyIncome());
		return workerRepository.save(worker);
	}

	@Override
	public Worker update(Worker worker) {
		
		return workerRepository.save(worker);
		
	}

	@Override
	public void delete(Long id) {
		Worker worker = workerRepository.findById(id).get();
		workerRepository.delete(worker);
	}

}
