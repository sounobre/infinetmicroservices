package com.dnobre.worker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dnobre.worker.entities.Worker;
import com.dnobre.worker.form.WorkerForm.WorkerFormPost;
import com.dnobre.worker.service.WorkerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RefreshScope
@RestController
@RequestMapping(value = "/workers")
@Api(tags = { "Worker" })
public class WorkerResource {

	@Autowired
	private WorkerService workerService;

	@ApiOperation(value = "${swagger.api.operation.worker.config.value}", notes = "${swagger.api.operation.worker.config.notes}")
	@GetMapping(value = "/configs")
	public ResponseEntity<Void> getConfigs() {
		return ResponseEntity.noContent().build();
	}

	@ApiOperation(value = "${swagger.api.operation.worker.listar.value}", notes = "${swagger.api.operation.worker.listar.notes}")
	@GetMapping
	public ResponseEntity<List<Worker>> findAll() {
		List<Worker> list = workerService.findAll();
		return ResponseEntity.ok(list);
	}

	@ApiOperation(value = "${swagger.api.operation.worker.buscarPorId.value}", notes = "${swagger.api.operation.worker.buscarPorId.notes}")
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id) {

		Worker obj = workerService.findById(id);
		return ResponseEntity.ok(obj);
	}

	@ApiOperation(value = "${swagger.api.operation.worker.criar.value}", notes = "${swagger.api.operation.worker.criar.notes}")
	@PostMapping
	public ResponseEntity<Worker> save(@RequestBody WorkerFormPost workerFormPost) {
		workerService.save(workerFormPost);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@ApiOperation(value = "${swagger.api.operation.worker.editar.value}", notes = "${swagger.api.operation.worker.editar.notes}")
	@PutMapping
	public ResponseEntity<Worker> update(@RequestBody Worker worker) {
		workerService.update(worker);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	@ApiOperation(value = "${swagger.api.operation.worker.delete.value}", notes = "${swagger.api.operation.worker.delete.notes}")
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Worker> delete(@PathVariable Long id) {
		workerService.delete(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

}
