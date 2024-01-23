package com.darksun.controller;

import com.darksun.model.Task;
import com.darksun.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/tasks" )
public class TaskController {

	@Autowired
	TaskService service;

	@PostMapping
	public ResponseEntity< Task > create( @RequestBody Task task ) {
		return new ResponseEntity<>( service.create( task ), HttpStatus.CREATED );
	}

	@GetMapping
	public ResponseEntity< List< Task > > readAll( ) {
		return new ResponseEntity<>( service.readAll( ), HttpStatus.OK );
	}

	@GetMapping( "/{id}" )
	public ResponseEntity< Task > readById( @PathVariable Long id ) {
		return new ResponseEntity<>( service.readById( id ), HttpStatus.OK );
	}

	@PutMapping
	public ResponseEntity< Task > update( @RequestBody Task task ) {
		return new ResponseEntity<>( service.update( task ), HttpStatus.OK );
	}
}
