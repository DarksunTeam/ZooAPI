package com.darksun.controller;

import com.darksun.model.Task;
import com.darksun.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/tasks" )
public class TaskController {

	@Autowired
	TaskService service;

	@PostMapping
	public ResponseEntity< Task > create( @RequestBody Task task ) {
		return new ResponseEntity<>( service.create( task ), HttpStatus.CREATED );
	}
}
