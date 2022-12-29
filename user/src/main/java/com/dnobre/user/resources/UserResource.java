package com.dnobre.user.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.dnobre.user.entities.User;
import com.dnobre.user.form.UserForm.UserFormPost;
import com.dnobre.user.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/users")
@Api(tags = { "User" })
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@ApiOperation(value = "${swagger.api.operation.user.buscarPorId.value}", 
			  notes = "${swagger.api.operation.user.buscarPorId.notes}")
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = userService.findById(id);
		return ResponseEntity.ok(obj);
	}	
	
	@ApiOperation(value = "${swagger.api.operation.user.listar.value}", 
			  notes = "${swagger.api.operation.user.listar.notes}")
	@GetMapping(value = "/search")
	public ResponseEntity<List<User>> findAll() {

		List<User> list = userService.findAll();
		return ResponseEntity.ok(list);
	}
	
	@ApiOperation(value = "${swagger.api.operation.user.criar.value}", 
			  notes = "${swagger.api.operation.user.criar.notes}")
	@PostMapping
	public ResponseEntity<User> save(@RequestBody UserFormPost userFormPost) {
		userService.save(userFormPost);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@ApiOperation(value = "${swagger.api.operation.user.editar.value}", 
			  notes = "${swagger.api.operation.user.editar.notes}")
	@PutMapping
	public ResponseEntity<User> update(@RequestBody User user) {
		userService.update(user);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@ApiOperation(value = "${swagger.api.operation.user.delete.value}", 
			  notes = "${swagger.api.operation.user.delete.notes}")
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<User> delete(@PathVariable Long id) {
		userService.delete(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}
